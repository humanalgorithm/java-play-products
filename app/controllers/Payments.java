package controllers;
import play.mvc.*;
import models.*;


public class Payments extends Controller {
    public static void show(int product_id) {
        Product product = models.Product.findById((long)product_id);
        render(product);
    }
}