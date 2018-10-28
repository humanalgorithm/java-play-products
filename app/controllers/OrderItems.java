package controllers;
import play.mvc.*;
import models.*;
import services.OrderItemsService;

import java.util.List;

public class OrderItems extends Controller {
    public static void createOrderItem(Address address, String stripeToken, double productPrice)
    {
        OrderItemsService service = new OrderItemsService(address, stripeToken, productPrice);
        boolean success = service.createOrderItem();
        if (success) {
            OrderItem orderItem = service.getCreatedOrderItem();
            orderItemCreated(orderItem, orderItem.getAddress());
        }
        else {
            orderItemCreationError(service.getError());
        }
    }

    public static void orderItemCreated(OrderItem orderItem, Address address){
        render(orderItem, address);
    }

    public static void orderItemCreationError(String error){
        render(error);
    }

    public static void list(){
        List<OrderItem> orderItems = OrderItem.findAll();
        render(orderItems);

    }



}
