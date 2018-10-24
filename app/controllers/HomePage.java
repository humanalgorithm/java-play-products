package controllers;
import play.*;
import play.db.DB;
import play.mvc.*;
import models.*;
import java.util.*;

public class HomePage extends Controller {
    public static void index() {
        List<Product> products = Product.findAll();
        render(products);
    }

}