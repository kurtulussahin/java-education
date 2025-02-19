package com.kurtulussahin.dependencyinjection.tightlycoupledcode;

import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService implements AutoCloseable {

    private final CommerceContext dbContext = new CommerceContext();
    private final Session session = dbContext.getSession();

    public ProductService() {
        dbContext.getSession().beginTransaction();
    }

    public List<Product> getFeaturedProducts(boolean isCustomerPreferred) {

        List<Product> featuredProducts = getFeaturedProducts();
        double discount = isCustomerPreferred ? 0.95 : 1.0;
        return getFeaturedProductsWithDiscountedPrice(featuredProducts, discount);
    }

    private List<Product> getFeaturedProducts() {
        Query<Product> query = session.createQuery("FROM Product where isfeatured='true'", Product.class);
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
        if (session != null && session.isOpen()) {
            session.close();
            System.out.println("Session is closed.");
        }
    }
}
