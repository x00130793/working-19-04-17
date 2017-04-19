package models.shopping;

import java.util.*;
import javax.persistence.*;
import java.util.Date;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

import models.*;
import models.users.*;

// ShopOrder entity managed by Ebean
@Entity
public class ShopOrder extends Model {

    @Id
    private Long id;
    
    private Date OrderDate;
    private Date deliverDate = null;
    private String orderStatus;
    
    @OneToMany(mappedBy="order", cascade = CascadeType.ALL)
    private List<OrderItem> items;
    
    @ManyToOne
    private Customer customer;

    // Default constructor
    public  ShopOrder() {
        OrderDate = new Date();
        orderStatus = "In Warehouse";
    }
    
    public double getOrderTotal() {
        
        double total = 0;
        
        for (OrderItem i: items) {
            total += i.getItemTotal();
        }
        return total;
    }
	
	//Generic query helper
    public static Finder<Long,ShopOrder> find = new Finder<Long,ShopOrder>(ShopOrder.class);

    
    public static List<ShopOrder> findAll() {
        return ShopOrder.find.all();
    }

    public static List<ShopOrder> findByCustomer(String email){
        return ShopOrder.find.where()                       
                        .eq("customer.email", email)
                        .ilike("email", "%" + email + "%")
                        .findList();
    }

    // public static List<ShopOrder> findById(String email){
    //     return ShopOrder.find.where()                       
    //                     .eq("customer.email", email)
    //                     .ilike("email", "%" + email + "%")
    //                     .findList();
    // }

    
    
    //Delivery status and info-----------------------------------------------------
    public String getStatus(){
        return orderStatus;
    }
    public Date getDeliveryDate(){
        return deliverDate;
    }
    public void setStatus(String s){
        this.orderStatus = s;
    }
    public void setDeliveryDate(Date deliverDate){
        this.deliverDate = deliverDate;
    }

    //Other getters and setters----------------------
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date orderDate) {
        OrderDate = orderDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

