import java.util.ArrayList;

public class MarketPlace {
    String name;
    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<Product> products = new ArrayList<Product>();
    private ArrayList<Order> orders = new ArrayList<Order>();
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    public MarketPlace(String name) {
        this.name = name;
    }
    public void addUser(User user) {
        this.users.add(user);
        if (user instanceof Customer) {
            this.customers.add((Customer) user);
        }
    }
    public void removeUser(User user) {
        this.users.remove(user);
        if (user instanceof Customer) {
            this.customers.remove((Customer) user);
        }
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void removeOrder(Order order) {
        this.orders.remove(order);
    }



    public MarketPlace(String name, ArrayList<User> users, ArrayList<Product> products, ArrayList<Order> orders,
            ArrayList<Customer> customers) {
        this.name = name;
        this.users = users;
        this.products = products;
        this.orders = orders;
        this.customers = customers;
    }
    public void run(){
        System.out.println("Welcome to  "+this.name + "  market");
        for (Product product : products) {
            System.out.println(product.getName() + " " + product.getPrice()+product.getCurrency());
        }
    }
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
