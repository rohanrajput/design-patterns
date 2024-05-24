package FILTER.Filters;

import FILTER.Filter;
import FILTER.Product;

import java.util.ArrayList;
import java.util.List;


public class FilterByColor implements Filter {
    String color;

    public FilterByColor(String color) {
        this.color = color;
    }

    public List<Product> getFilteredProducts(List<Product> allProducts) {
        List<Product> products = new ArrayList<Product>();

        for(Product product: allProducts) {
            if(product.getColor().equals(color)) {
                products.add(product);
            }
        }

        return products;
    } 
}