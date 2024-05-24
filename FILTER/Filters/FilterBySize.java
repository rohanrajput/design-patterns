package FILTER.Filters;

import FILTER.Filter;
import FILTER.Product;

import java.util.ArrayList;
import java.util.List;

public class FilterBySize implements Filter {
    String size;

    public FilterBySize(String size) {
        this.size = size;
    }

    public List<Product> getFilteredProducts(List<Product> allProducts) {
        List<Product> products = new ArrayList<Product>();

        for(Product product: allProducts) {
            if(product.getSize().equals(size)) {
                products.add(product);
            }
        }

        return products;
    }
}
