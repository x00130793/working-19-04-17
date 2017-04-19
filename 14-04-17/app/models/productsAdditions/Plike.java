package models.productsAdditions;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;

import com.avaje.ebean.Model;
import com.avaje.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.*;
import models.users.*;

@Entity
public class Plike extends Model implements Serializable{


    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long likeId;

    private int likeCount;

    @ManyToMany(mappedBy = "likes")
    private List<Customer> cus = new ArrayList<>();

    @OneToOne
    private Product pl;

    


    // Default constructor
    public Plike() {
        likeCount = 0;
    }

    public Plike(Product p) {
        pl = p;
    }

    
	
    public static Finder<String, Plike> find = new Finder<String, Plike>(Plike.class);

    public static List<Plike> findAll() {
        return Plike.find.all();
    } 
    
    // public static List<Plike> findByCustomer(String email){
    //     return Like.find.where()                       
    //                     .eq("customer.email", email)
    //                     .ilike("email", "%" + email + "%")
    //                     .findList();
    // }

    // public static List<Plike> findByProduct(Long id){
    //     return Like.find.where()                       
    //                     .eq("product.id", id)
    //                     .ilike("id", "%" + id + "%")
    //                     .findList();
    // }
    
    

    // public void addUser(Customer c) {
    //     cus.add(c);
    //     c.getLikes().add(this);
    // }

    public void setLikeId(Long idIn) {
        likeId = idIn;
    }



    public void setPost(Product pIn) {
        pl = pIn;
    }

    public Long getLikeId() {
        return likeId;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public List<Customer> getCustomer() {
        return cus;
    }

    public void setCustomers(List<Customer> customers) {
        this.cus = customers;
    }

    public Product getProduct() {
        return pl;
    }

    public void setProduct(Product pl) {
        this.pl = pl;
    }

    public void addCustomer(Customer c){
        cus.add(c);
        c.getLikes().add(this);
    }

    public void removeCustomer(Customer c){
        cus.remove(c);
        c.getLikes().remove(this);   
    }

    
    public void addLike(Customer c){
        boolean found = false;
        for(int i = 0; i < cus.size(); i++){
            if(cus.get(i).getEmail() == c.getEmail()){
                found = true;
            }
        }

        if(found != true){
            likeCount++;
            addCustomer(c);           
        } else {
            removeCustomer(c);
            likeCount--;
        }

    }
}  
