package FILTER;

import FILTER.Filters.AndFilter;
import FILTER.Filters.FilterByColor;
import FILTER.Filters.FilterBySize;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShirtProducts shirtProducts = new ShirtProducts();
        shirtProducts.addShirt("S1", "Red", "M", "B1");
        shirtProducts.addShirt("S2", "Red", "M", "B2");
        shirtProducts.addShirt("S3", "Blue", "L", "B1");

        List<Product> allShirts = shirtProducts.getAllShirts();

        Filter filterByColor = new FilterByColor("Red");

        Filter filterBySize = new FilterBySize("M");
//
//        List<Product> filteredProducts = filterBySize.getFilteredProducts(allShirts);
        Filter[] filters = new Filter[] {filterByColor, filterBySize};

        Filter filterBySizeAndColor = new AndFilter(filters);

        List<Product> filteredProducts = filterBySizeAndColor.getFilteredProducts(allShirts);

        for(Product p: filteredProducts) {
            System.out.println(p.getName());
        }
    }
}
