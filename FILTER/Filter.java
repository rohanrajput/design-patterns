package FILTER;

import java.util.List;

public interface Filter {
    public List<Product> getFilteredProducts(List<Product> allProducts);
}
