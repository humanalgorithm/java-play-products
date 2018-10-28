package controllers;
import play.mvc.*;
import models.*;
import services.AddressValidator;


import java.util.List;

public class Payments extends Controller {
    public static void show(int product_id) {
        Product product = getByProductId(product_id);
        render(product);
    }

    public void submitPayment(String address_line1,  String address_city, String address_state,
                                     String address_zip, String stripeToken, int product_id) {
        Product product = getByProductId(product_id);
        redirectIfInvalidAddress(address_line1, address_city, address_state, address_zip, product);
        Address address = new Address(address_line1, address_city, address_state, address_zip);
        address.save();
        OrderItems.createOrderItem(address, stripeToken, product);
    }

    public void redirectIfInvalidAddress(String address_line1,  String address_city, String address_state,
                                                String address_zip, Product product){
        AddressValidator addressValidator = new AddressValidator(address_line1, address_city, address_state, address_zip);
        if (!addressValidator.isValid()){
            List<String> errors_list = addressValidator.getErrors();
            renderTemplate("app/views/Payments/show.html",product, errors_list);
        }
    }

    public static Product getByProductId(int product_id){
        Product product = models.Product.findById((long)product_id);
        return product;
    }
}