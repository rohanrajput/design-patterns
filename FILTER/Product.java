package FILTER;
import java.util.ArrayList;
import java.util.List;

public abstract class Product {
    String name;
    String color;
    String size;
    String price;

    public Product(String name, String color, String size, String price) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

class Shirt extends Product {
    public Shirt(String name, String color, String size, String price) {
        super(name, color, size, price);
    }
}


