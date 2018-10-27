package controllers;
import play.mvc.*;
import models.*;
import services.AddressValidator;

import java.util.List;

public class OrderItems extends Controller {
    public static void createOrderItem()
    {
    }

    public static void orderItemCreated(OrderItem orderItem, Address address){
        render(orderItem, address);
    }

    public static void list(){
        List<OrderItem> orderItems = OrderItem.findAll();
        render(orderItems);

    }


}
