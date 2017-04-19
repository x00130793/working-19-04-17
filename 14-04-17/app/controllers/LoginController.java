package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;
import views.html.customer.*;
import views.html.customer.profileFiles.*;
// Import models
import models.*;
import models.users.*;


public class LoginController extends Controller {

    /** Dependency Injection **/
    /** http://stackoverflow.com/questions/15600186/play-framework-dependency-injection **/
    private FormFactory formFactory;

    /** http://stackoverflow.com/a/37024198 **/
    private Environment env;

    /** http://stackoverflow.com/a/10159220/6322856 **/
    @Inject
    public LoginController(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    // Render and return  the Login view
    public Result login(Long cat, String filter) {

	Form<User> addUserForm = formFactory.form(User.class);

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Login> loginForm = formFactory.form(Login.class);	
	List<Category> categoriesList = Category.findAll();
        // Render the Add Product View, passing the form object
        return ok(login.render(loginForm,addUserForm, User.getUserById(session().get("email")), categoriesList, cat, filter));
    }

    // Handle login submit
    public Result loginSubmit(Long cat, String filter) {
        // Bind form instance to the values submitted from the form
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();
	Form<User> addUserForm = formFactory.form(User.class);
	List<Category> categoriesList = Category.findAll();
        // Check for errors
        // Uses the validate method defined in the Login class
        if (loginForm.hasErrors()) {
            // If errors, show the form again
            return badRequest(login.render(loginForm, addUserForm, User.getUserById(session().get("email")), categoriesList, cat, filter));
        }
        else {
            // User Logged in successfully
            // Clear the existing session - resets session id
            session().clear();
            // Store the logged in email in the session (cookie)
            session("email", loginForm.get().getEmail());
        }
        // Return to admin or customer home page
        User u = User.getUserById(session().get("email"));
        if (u.getRole().equals("admin")) {
            return redirect(controllers.routes.AdminController.products(0));
        }
        else {
            return redirect(controllers.routes.HomeController.index(cat, filter));
        }
    }
	
	

    public Result addUserSubmit(Long cat, String filter){
        Form<User> addUserForm = formFactory.form(User.class).bindFromRequest();
	
        User u = addUserForm.get();

        if(addUserForm.hasErrors()){
            flash("fail", "User" + u.getEmail() + "is already in our database.");
            return redirect(controllers.routes.LoginController.login(cat, filter));
        }

        if (u.getEmail() != null){
            u.save();
            flash("success", "User " + u.getEmail() + " has been registered.");
        }

        return redirect(controllers.routes.LoginController.login(cat, filter));
    }

    // Logout
    public Result logout(Long cat, String filter) {
        // Delete the current session
        // Generates a new session id
        session().clear();
        flash("success", "You've been logged out");
        return redirect(routes.LoginController.login(cat, filter));
    }

}
