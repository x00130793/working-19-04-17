package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import com.avaje.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.*;
import models.shopping.*;
import models.productsAdditions.*;
import models.users.*;

// Product Entity managed by the ORM
@Entity
public class Product extends Model {

    @Id
    private Long id;
    
    //Mapping
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "products")
    private List<Category> categories = new ArrayList<Category>();

    @OneToMany(mappedBy="product", cascade = CascadeType.ALL)
    private List<OrderItem> orderProducts;

    @OneToMany(mappedBy="product", cascade = CascadeType.ALL)
    private List<Comment> comment;

    @OneToOne(mappedBy = "pl")
    private Plike plike;

    @OneToMany(mappedBy="product", cascade = CascadeType.ALL)
    private List<Size> sizes;



    //@OneToOne(mappedBy="product")
    //public OrderItem item = new OrderItem();

    // List of category ids - this will be bound to checkboxes in the view form
    private List<Long> catSelect = new ArrayList<Long>();

    // Other fields marked as being required (for validation purposes)
    @Constraints.Required
    private String name;

    @Constraints.Required
    private String description;

    @Constraints.Required
    private int	stock;

    @Constraints.Required
    private double price;


    private Plike l;
   

    // Default constructor
    public Product() {
    }

    // Constructor to initialise object
    public Product(Long id, String name, String description, int stock, double price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
	
    }
	
	//Generic query helper for entity Computer with id Long
    public static Finder<Long,Product> find = new Finder<Long,Product>(Product.class);

    // Find all Products in the database
    // Filter product name 
    public static List<Product> findAll(String filter) {
        return Product.find.where()
                // name like filter value (surrounded by wildcards)
                .ilike("name", "%" + filter + "%")
                .orderBy("name asc")
                .findList();
    }
    
    // Find all Products for a category
    // Filter product name 
    public static List<Product> findFilter(Long catID, String filter) {
        return Product.find.where()
                        // Only include products from the matching cat ID
                        // In this case search the ManyToMany relation
                        .eq("categories.id", catID)
                        // name like filter value (surrounded by wildcards)
                        .ilike("name", "%" + filter + "%")
                        .orderBy("name asc")
                        .findList();
    }


    public void updateStock(int qty){
        this.stock = this.stock - qty;
        save();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Long> getCatSelect() {
        return catSelect;
    }

    public void setCatSelect(List<Long> catSelect) {
        this.catSelect = catSelect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Plike getPlike() {
        return plike;
    }

    public void setPlike(Plike plike) {
        this.plike = plike;
    }

    public void likePost(Customer u){
        plike.addLike(u);
        plike.update();
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
}
