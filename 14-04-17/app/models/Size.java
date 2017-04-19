package models;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;
import models.*;
import models.users.*;
import models.shopping.*;


@Entity
public class Size extends Model {
    @Id
    private Long id;

    private String sizeName;
    private String sizeQty;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Basket basket;

    public Size(Long id, String sizeName, String sizeQty, Product product, Basket basket) {
        this.id = id;
        this.sizeName = sizeName;
        this.sizeQty = sizeQty;
        this.product = product;
        this.basket = basket;
    }

    public String getSizeName() {
        return sizeName;
    }

    public Product getProduct() {
        return product;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getSizeQty() {
        return sizeQty;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setSizeQty(String sizeQty) {
        this.sizeQty = sizeQty;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Finder<Long,Size> find = new Finder<Long,Size>(Size.class);

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Size s: Size.find.orderBy("sizeName, product.id").findList()) {
            options.put(s.toString(), s.sizeName);
        }
        return options;
    }

    

    public static List<Size> findBySize(Long pId){
        return Size.find.where()
                .eq("product.id", pId)
                .findList();
    }

    public static Size getSizeById(Long sId) {
        if (sId == null)
            return null;
        else
            // Find user by id and return object
            return find.byId(sId);
    }

    
}
