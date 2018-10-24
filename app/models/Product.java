package models;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Product extends Model {

    public String name;
    public String url;
    public String description;
    public int price;


}