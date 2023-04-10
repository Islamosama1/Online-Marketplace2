import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<Product> cart = new ArrayList<Product>();

    public Customer(String username, String password, String email) {
        super(username, password, email);
    }

    // when the user add a new product to the list of sells
    public void addToCart(Product product) {
        this.cart.add(product);
    }

    public void removeFromCart(Product product) {
        this.cart.remove(product);
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Product> cart) {
        this.cart = cart;
    }

}
