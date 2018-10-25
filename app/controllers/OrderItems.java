package controllers;
import play.mvc.*;
import models.*;


import java.util.List;

public class OrderItems extends Controller {
    public static void createOrderItem(
            String address_line1,
            String address_city,
            String address_state,
            String address_zip,
            String stripeToken)
    {
        Address address = new Address(address_line1, address_city, address_state, address_zip);
        address.save();
        OrderItem orderItem = new OrderItem(stripeToken, address);
        orderItem.save();
        orderItemCreated(orderItem, address);
    }

    public static void orderItemCreated(OrderItem orderItem, Address address){
        render(orderItem, address);
    }
    public static void list(){
        List<OrderItem> orderItems = OrderItem.findAll();
        render(orderItems);

    }
}
