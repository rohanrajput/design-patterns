package FILTER.Filters;

import FILTER.Filter;
import FILTER.Product;

import java.util.List;

public interface FilterDecorators extends Filter {
    public List<Product> getFilteredProducts(List<Product> products);
}
