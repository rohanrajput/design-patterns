package FILTER.Filters;

import FILTER.Filter;
import FILTER.Product;

import java.util.ArrayList;
import java.util.List;

public class AndFilter implements FilterDecorators {
    Filter[] filters;

    public AndFilter(Filter[] filters) {
        this.filters = filters;
    }

    public List<Product> getFilteredProducts(List<Product> allProducts) {
        List<Product> filteredProducts = new ArrayList<>(allProducts);

        for(Filter filter: filters) {
            filteredProducts = filter.getFilteredProducts(filteredProducts);
        }

        return filteredProducts;
    }
}
