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

    public Product(String name, double unitPrice, String description, boolean isFeatured) {

        this.name = name;
        this.unitPrice = unitPrice;
        this.description = description;
        this.isFeatured = isFeatured;
    }
}
