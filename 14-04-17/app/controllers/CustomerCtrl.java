package controllers;

import play.data.*;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.With;
import views.html.*;
import views.html.customer.*;
import views.html.customer.profileFiles.*;
import controllers.security.*;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
// Import models
import models.productsAdditions.*;
import models.shopping.*;
import models.users.*;
import models.*;
// Import security controllers

@Security.Authenticated(Secured.class)
@With(CheckIfCustomer.class)
public class CustomerCtrl extends Controller {

    private FormFactory formFactory;


    //  Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public CustomerCtrl(FormFactory f) {
        this.formFactory = f;
    }

   List<Category> categoriesList = Category.findAll();

    private User getUserFromSession() {
        return User.getUserById(session().get("email"));
    }
    private Customer getCurrentCustomer() {
        return (Customer)User.getUserById(session().get("email"));
    }


    //----------------------------MAIN CONTROLLERS--------------------

    //Profile---------------------- J.T.
    public Result profile(Long cat, String filter) {
        return ok(profile.render(getCurrentCustomer(), User.getUserById(session().get("email")), categoriesList, cat, filter));
    }
    public Result profileEdit(Long cat, String filter) {
        return ok(profileEdit.render(getCurrentCustomer(), User.getUserById(session().get("email")), categoriesList, cat, filter));
    }

    //Orders----------------------- J.T.
    public Result orderHistory(Long cat, String filter) {
        List<ShopOrder> ord = ShopOrder.findByCustomer(session().get("email"));

        return ok(orderHistory.render(getCurrentCustomer(), User.getUserById(session().get("email")), categoriesList, cat, ord, filter));
    }

    public Result cancelOrder(Long cat, String filter, Long id){
        ShopOrder.find.ref(id).delete();
        flash("Order has been cancelled");
        List<ShopOrder> ord = ShopOrder.findByCustomer(session().get("email"));

        return ok(orderHistory.render(getCurrentCustomer(), User.getUserById(session().get("email")), categoriesList, cat, ord, filter));
    }

    //Comments----------------------- J.T.
    public Result comment(Long cat, String filter, Long id){

        Form<Comment> comment = formFactory.form(Comment.class).bindFromRequest();

        Comment c = comment.get();

        c.setCustomer(getCurrentCustomer());
        c.setProduct(Product.find.byId(id));

        c.save();

        return redirect(controllers.routes.HomeController.productDetails(cat, filter, id));

    }	

    
	
    public Result payment(Long cat, String filter) {	    
        return ok(payment.render(getCurrentCustomer(), User.getUserById(session().get("email")), categoriesList, cat, filter));
    }

    
    


}
