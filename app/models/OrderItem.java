package models;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class OrderItem extends Model {

    @Id
    @GeneratedValue
    @Column(name="id")
    public Long id;

    public String stripeToken;
    public String UUID;
    public long  address_id;

    public OrderItem(String stripeToken, Address address){
        this.stripeToken = stripeToken;
        this.UUID = java.util.UUID.randomUUID().toString();
        this.address_id = address.id;
    }
}