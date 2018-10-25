package controllers;
import play.mvc.*;
import models.*;
import java.util.*;

public class Products extends Controller {
    public static void list() {
        List<Product> products = Product.findAll();
        render(products);
    }
}