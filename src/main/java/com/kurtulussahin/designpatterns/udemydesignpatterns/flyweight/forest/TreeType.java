package com.kurtulussahin.designpatterns.udemydesignpatterns.flyweight.forest;

import java.awt.Color;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }
}
