import java.util.ArrayList;
public class Order {
    Customer customer;
    String orderId;
    ArrayList<Product> products = new ArrayList<Product>();
    double totalPrice;
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void addProduct(Product product) {
        this.products.add(product);
        this.totalPrice += product.getPrice();
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
        this.totalPrice -= product.getPrice();
    }
}
