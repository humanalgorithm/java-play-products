package models;
import javax.persistence.*;
import play.db.jpa.*;

@Entity
public class Address extends Model {

    @Id
    @GeneratedValue
    @Column(name="id")
    @OneToOne
    public Long id;

    public String address_line1;
    public String address_city;
    public String address_state;
    public String address_zip;

    public Address(String address_line1, String address_city, String address_state, String address_zip){
        this.address_line1 = address_line1;
        this.address_city = address_city;
        this.address_state = address_state;
        this.address_zip = address_zip;
    }
}