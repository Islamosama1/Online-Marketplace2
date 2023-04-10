import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MarketPlace marketPlace = new MarketPlace("TAGERLY", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        // create users
        User user1 = new User("Lio Messi" , "lio8298" , "lio255@gmail.com");
        User user2 = new User("CR7" , "cr76661" , "cr76661@gmail.com");

        // add users to the marketplace
        marketPlace.getUsers().add(user1);//users.add(user1);
        marketPlace.getUsers().add(user2);

        // create products
        Product product1 = new Product("i8819" ,"SMART WATCH" ,155 , "EG" ,"The most stylish smart watch at an affordable price.");
        Product product2 = new Product("i2223" ,"MACHINE COFEE" ,220 , "EG" ,"The most stylish MACHINE COEFEE at an affordable price.");

        // add products to the marketplace
        marketPlace.getProducts().add(product1);
        marketPlace.getProducts().add(product2);
        marketPlace.run();

        // create customers
        Customer customer1 = new Customer("John Doe", "password123", "johndoe@gmail.com");
        Customer customer2 = new Customer("Jane Doe", "password456", "janedoe@gmail.com");

        // add customers to the marketplace
        marketPlace.getCustomers().add(customer1);
        marketPlace.getCustomers().add(customer2);

        // customer1 adds product1 to their cart
        customer1.addToCart(product1);

        // create an order for customer1
        Order order1 = new Order();
        order1.setCustomer(customer1);
        order1.setOrderId("1234");
        order1.setProducts(customer1.getCart());
        order1.setTotalPrice(product1.getPrice());

        // add the order to the marketplace
        marketPlace.getOrders().add(order1);

        // create a payment for order1
        Payment payment1 = new Payment("1234567890", 155);

        // print the order and payment details
        System.out.println("Order details:");
        System.out.println("Customer: " + order1.getCustomer().getUsername());
        System.out.println("Order ID: " + order1.getOrderId());
        System.out.println("Products: ");
        for (Product product : order1.getProducts()) {
            System.out.println("- " + product.getName() + " (" + product.getPrice() + " " + product.getCurrency() + ")");
        }
        System.out.println("Total Price: " + order1.getTotalPrice() + " " + product1.getCurrency());
        System.out.println();
        System.out.println("Payment details:");
        System.out.println("Customer Cash Number: " + payment1.getCustomerCashNumber());
        System.out.println("Amount: " + payment1.getAmount() + " " + product1.getCurrency());
    }
}

