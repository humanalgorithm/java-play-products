# java-play-products

# Fun with Java Play Framework
## Product Checkout App

### Demonstrates usage of Java Play Framework with a simplified product checkout page.

## Products Page List View
![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/screenshots/products_page_grid.png "Products Page list view")
  
## Products Page Grid View  
![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/screenshots/products_page_list.png "Products Page list view")
   
 ## Payment Selection
![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/screenshots/payment_selection_page.png "Payment selection page")
 
 ## Order Created Page
![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/screenshots/order_created_page.png "Order Created Page"

## Requirements
1. You must have a local instance of MySQL running with a database named "products"
2. A user with username "root" and password "root", or change the db config in application.conf
3. Enable legacy authentication on your MySQL server instance

## To Run
 1. From one directiory above this folder apply evolutions: "play evolutions:apply java-play-products"
   + Note that you must first run these database scripts before the application will work*
 2. Run server: "java run java-play-products"
 3. Browse to localhost:9000
 
 ## Other requirements notes:
 1. Make sure you have Java 1.8 installed
 2. Make sure you have mysql-connector.jar in your Java Runtime Environment
 3. Your mysql server should be version 8.0 or above
