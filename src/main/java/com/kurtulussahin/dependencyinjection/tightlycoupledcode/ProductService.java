package com.kurtulussahin.dependencyinjection.tightlycoupledcode;

import org.hibernate.query.Query;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService implements AutoCloseable {

    private final CommerceContext dbContext = new CommerceContext();

    public ProductService() {
        dbContext.getSession().beginTransaction();
    }

    public List<Product> getFeaturedProducts(boolean isCustomerPreferred) {

        List<Product> featuredProducts = getFeaturedProducts();
        double discount = isCustomerPreferred ? 0.95 : 1.0;
        return getFeaturedProductsWithDiscountedPrice(featuredProducts, discount);
    }

    private List<Product> getFeaturedProducts() {
        Query<Product> query = dbContext.getSession().createQuery("FROM Product where isfeatured='true'", Product.class);
        List<Product> featuredProducts = query.getResultList();
        return featuredProducts;
    }

    private static List<Product> getFeaturedProductsWithDiscountedPrice(List<Product> featuredProducts, double discount) {
        return featuredProducts.stream()
                .map(product -> new Product(
                        product.getProductID(),
                        product.getName(),
                        product.getUnitPrice() * discount,
                        product.getDescription(),
                        product.isFeatured()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public void close() {
        if (dbContext.getSession() != null && dbContext.getSession().isOpen()) {
            dbContext.getSession().close();
            System.out.println("Session is closed.");
        }
    }
}
