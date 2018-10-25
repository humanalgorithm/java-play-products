package models;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Product extends Model {

    @Id
    @GeneratedValue
    @Column(name="id")
    public Long id;
    public String name;
    public String url;
    public String description;
    public double price;
}