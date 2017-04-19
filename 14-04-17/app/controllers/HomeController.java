package controllers;

import controllers.security.AuthAdmin;
import controllers.security.Secured;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import play.api.Environment;

import views.html.*;
import views.html.customer.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;

import java.io.File;
import javax.inject.Inject;
import play.Logger;

import java.util.regex.Pattern;

// Import models
import models.*;
import models.Size;
import models.users.*;
import models.productsAdditions.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
     // Declare a private FormFactory instance
    private FormFactory formFactory;


    private Environment env;

    private Size size;


    //  Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public HomeController(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    // Method retuns the logged in user (or null)
    private User getUserFromSession() {
        return User.getUserById(session().get("email"));
    }
    private Customer getCurrentCustomer() {
        return (Customer)User.getUserById(session().get("email"));
    }
	 
    public Result index(Long cat, String filter) {
       List<Category> categoriesList = Category.findAll();
        List<Product> productsList = new ArrayList<Product>();
        List<Product> newProductList = new ArrayList<Product>();
	
        if (cat == 0) {
            // Get list of all categories in ascending order
            productsList = Product.findAll(filter);
        }
        else {
            // Get products for selected category
            // Find category first then extract products for that cat.
            productsList = Product.findFilter(cat, filter);
}
        int sizeOfLoop=0;
        if(productsList.size() > 9){
            sizeOfLoop = 9;
        } else if (productsList.size() > 6){
            sizeOfLoop =6;
        }
        for(int i = 0; i < sizeOfLoop; i++){
            newProductList.add(productsList.get(i));
        }

       return ok(index.render(env, categoriesList, newProductList, getUserFromSession(), cat, filter));
   }
	

     public Result productDetails(Long cat, String filter, Long id, Long sId) {
	List<Category> categoriesList = Category.findAll();
	Product p = Product.find.byId(id);
    Form<Comment> commentForm = formFactory.form(Comment.class);
    List<Comment> c = Comment.findByProduct(id);
    List<Size> sList = Size.findBySize(sId);
    


        return ok(productDetails.render(categoriesList, getUserFromSession(), cat, sId, filter, id, p, c, sList, commentForm, size));
    }



    public Result products(Long cat, String filter) {

        // Get list of all categories in ascending order
        List<Category> categoriesList = Category.findAll();
        List<Product> productsList = new ArrayList<Product>();

        if (cat == 0) {
            // Get list of all categories in ascending order
            productsList = Product.findAll(filter);
        }
        else {
            // Get products for selected category
            // Find category first then extract products for that cat.
            productsList = Product.findFilter(cat, filter);
        }

        return ok(products.render(env, categoriesList, productsList, cat, filter, getUserFromSession()));
    }


    private final Pattern hasUppercase = Pattern.compile("[A-Z]");
    private final Pattern hasLowercase = Pattern.compile("[a-z]");
    private final Pattern hasNumber = Pattern.compile("\\d");
    private final Pattern hasSpecialChar = Pattern.compile("[^a-zA-Z0-9 ]");
    private final Pattern hasAt = Pattern.compile("[@]");

    public Result addUserSubmit(Long cat, String filter){
        Form<User> addUserForm = formFactory.form(User.class).bindFromRequest();
        User u = addUserForm.get();

        if(addUserForm.hasErrors()){
            flash("fail", "User" + u.getEmail() + "is already in our database.");
            return redirect(controllers.routes.LoginController.login(cat, filter));
        }

        if (!u.getPassword().equals(u.getPassword2())) {
            flash("fail", "Passwords don't match");
        }

        if((u.getPassword().length() < 8) && (u.getPassword2().length() < 8)){
            flash("fail", "Password is too short");
        }

        if(!hasUppercase.matcher(u.getPassword()).find() || !hasUppercase.matcher(u.getPassword2()).find()){
            flash("fail", "Password does not have uppercase");
        }



        if(!hasLowercase.matcher(u.getPassword()).find() || !hasLowercase.matcher(u.getPassword2()).find()){
            flash("fail", "Password does not have lowercase");
        }

        if(!hasNumber.matcher(u.getPassword()).find() || !hasNumber.matcher(u.getPassword2()).find()){
            flash("fail", "Password does not have a number");
        }

        if(!hasSpecialChar.matcher(u.getPassword()).find() || !hasSpecialChar.matcher(u.getPassword2()).find()){
            flash("fail", "Password does not have a special character i.e. !,@,#, etc.");
        }

        if(!hasAt.matcher(u.getEmail()).find()){
            flash("fail", "Email needs an '@' ");
        }

        else if (u.getPassword().equals(u.getPassword2()) && ((u.getPassword().length() >= 8) && (u.getPassword2().length() >= 8)) && (hasUppercase.matcher(u.getPassword()).find() && hasUppercase.matcher(u.getPassword2()).find()) && (hasLowercase.matcher(u.getPassword()).find() && hasLowercase.matcher(u.getPassword2()).find()) && (hasNumber.matcher(u.getPassword()).find() && hasNumber.matcher(u.getPassword2()).find())&& (hasAt.matcher(u.getEmail()).find())){
           
            flash("success", "User " + u.getEmail() + " has been registered.");
            u.save();
        }

        return redirect(controllers.routes.LoginController.login(cat, filter));


    }

   

    //Liking a Post
    @Transactional
    public Result like(Long cat, String filter, Long id, String whereCameFrom) {
        List<Category> categoriesList = Category.findAll();
        List<Product> productsList = Product.findAll(filter);
        Product p = Product.find.byId(id);
        p.likePost(getCurrentCustomer());

        p.update();
        if(whereCameFrom == "index"){
            return redirect(controllers.routes.HomeController.index(cat, filter));
        } else {
            return ok(products.render(env, categoriesList, productsList, cat, filter, getUserFromSession()));
        }
    }


}
