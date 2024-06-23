package com.kurtulussahin.java.designpatterns.flyweight.forest;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
	static Map<String, TreeType> treeTypes = new HashMap<>();
	private static int treeTypeCount=0;
	
    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
            treeTypeCount++;
            System.out.println("treeTypeCount: "+treeTypeCount);
        }
        return result;
    }
}
