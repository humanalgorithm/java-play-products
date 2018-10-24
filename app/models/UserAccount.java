package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class UserAccount extends Model {

    public String email;
    public String password;
    public String fullName;;
    public String username;
    public boolean isAdmin;

}