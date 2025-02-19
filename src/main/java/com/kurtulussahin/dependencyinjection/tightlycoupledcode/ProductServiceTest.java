package com.kurtulussahin.dependencyinjection.tightlycoupledcode;

public class ProductServiceTest {

    public static void main(String[] args) {
        ProductService productService = new ProductService();

        System.out.println("Featured products for preferred customers:");
        productService.getFeaturedProducts(true).forEach(System.out::println);
        System.out.println("*****************************************");
        System.out.println("Discounted Price: "+ productService.getFeaturedProducts(true).get(0).getUnitPrice());
        System.out.println("*****************************************");
        System.out.println("Featured products for non-preferred customers:");
        productService.getFeaturedProducts(false).forEach(System.out::println);

        productService.close();
    }
}
