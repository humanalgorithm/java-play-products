package models;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class OrderItem extends Model {

    @Id
    @GeneratedValue
    @Column(name="id")
    public Long id;

    public String stripeId;
    public String UUID;
    public long address_id;
    public long product_id;

    public OrderItem(String stripeId, Address address, Product product){
        this.stripeId = stripeId;
        this.UUID = java.util.UUID.randomUUID().toString();
        this.address_id = address.id;
        this.product_id = product.id;
    }

    public Address getAddress(){
        Address address = Address.findById(this.address_id);
        return address;
    }

    public Product getProduct(){
        Product product = Product.findById(this.product_id);
        return product;
    }

}