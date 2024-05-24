package FILTER;
import java.util.ArrayList;
import java.util.List;

public class ShirtProducts {
    List<Product> shirts;
    
    public ShirtProducts() {
        this.shirts = new ArrayList<>();
    }

    public void addShirt(String name, String color, String size, String brand) {
        Product shirt = new Shirt(name, color, size, brand);
        shirts.add(shirt);
    }

    public List<Product> getAllShirts() {
        return shirts;
    }
}
