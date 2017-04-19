package models.productsAdditions;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import com.avaje.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.*;
import models.users.*;

@Entity
public class Comment extends Model {


    @Id
    private Long id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Customer customer;

    @Constraints.Required
    private String content;


    public static Finder<Long,Comment> find = new Finder<Long,Comment>(Comment.class);

    public static List<Comment> findAll() {
        return Comment.find.all();
    }

    public static List<Comment> findByProduct(Long pId){
        return Comment.find.where()
                .eq("product.id", pId)
                .findList();
    }

    public Comment() {
    }

    public Comment(Long id, Product product, Customer customer, String content) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
