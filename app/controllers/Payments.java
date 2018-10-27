package controllers;
import play.mvc.*;
import models.*;
import services.AddressValidator;
import play.data.validation.*;
import java.util.ArrayList;
import views.Payments.*;
import java.util.List;

public class Payments extends Controller {
    public static void show(int product_id, ArrayList<String> errors) {
        if (errors == null){
             errors = new ArrayList<String>();
        }
        Product product = models.Product.findById((long)product_id);
        System.out.println("errors in show is");
        System.out.println(errors);
        List errors_list = errors.subList(0, errors.size());
        render(product, errors_list);
    }

    public static void submitPayment(String address_line1,
                                     String address_city,
                                     String address_state,
                                     String address_zip,
                                     String stripeToken) {

        AddressValidator addressValidator = new AddressValidator(address_line1, address_city, address_state, address_zip);
        if (!addressValidator.isValid()){
            System.out.println("errors is ");
            ArrayList <String> errors = addressValidator.getErrors();
            System.out.println(errors);
            flash("errors", errors);
            //renderTemplate("Views.Payments.show.html", addressValidator.getErrors());
            show(42, errors);

        }
        else {
           controllers.Products.list();
        }
    }
}