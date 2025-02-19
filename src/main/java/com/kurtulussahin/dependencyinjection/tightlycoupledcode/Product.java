package com.kurtulussahin.dependencyinjection.tightlycoupledcode;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="productID", nullable=false, updatable=false)
    private int productID;

    @Column(name="name")
    private String  name;

    @Column(name="unitPrice")
    private double unitPrice;

    @Column(name="description")
    private String description;

    @Column(name="isFeatured")
    private boolean isFeatured;

    public Product() {
    }

    public Product(String name, double unitPrice, String description, boolean isFeatured) {
        this.productID = productID;
        this.name = name;
        this.unitPrice = unitPrice;
        this.description = description;
        this.isFeatured = isFeatured;
    }
    public Product(int productID, String name, double unitPrice, String description, boolean isFeatured) {
        this.productID = productID;
        this.name = name;
        this.unitPrice = unitPrice;
        this.description = description;
        this.isFeatured = isFeatured;
    }

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFeatured() {
        return isFeatured;
    }
}
