package services;

import models.*;
import com.stripe.Stripe;
import java.util.Map;
import java.util.HashMap;
import com.stripe.model.Charge;
import com.stripe.exception.StripeException;


public class OrderItemsService {
    public Address address;
    public String stripeToken;
    public double productPrice;
    public Charge chargeResult;
    public OrderItem createdOrderItem;
    public String errorResult;
    public static final String API_KEY = "sk_test_GYOrNT2FV5WmNaLnab77e3RD";

    public OrderItemsService(Address address, String stripeToken, double productPrice){
        this.address = address;
        this.stripeToken = stripeToken;
        this.productPrice = productPrice;
    }

    public boolean createOrderItem(){
        boolean success = chargeStripe();
        if (success){
            OrderItem orderItem = new OrderItem(this.chargeResult.getId(), this.address);
            orderItem.save();
            this.createdOrderItem = orderItem;
            return true;
        }
        return false;
    }

    public boolean chargeStripe() {

        Stripe.apiKey = this.API_KEY;

        Map<String, Object> chargeMap = new HashMap<String, Object>();
        chargeMap.put("amount", (long)this.productPrice);
        chargeMap.put("currency", "usd");
        chargeMap.put("source", this.stripeToken);

        try {
            Charge charge = Charge.create(chargeMap);
            this.chargeResult = charge;
            return true;
        } catch (StripeException e) {
            e.printStackTrace();
            this.errorResult = e.toString();
            return false;
        }
    }

    public OrderItem getCreatedOrderItem(){
        return this.createdOrderItem;
    }

    public String getError(){
        return this.errorResult;
    }

}
