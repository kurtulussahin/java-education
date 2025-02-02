package com.kurtulussahin.designpatterns.udemydesignpatterns.flyweight.forest;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Forest {
	 private List<Tree> trees = new ArrayList<>();

	    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
	        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
	        Tree tree = new Tree(x, y, type);
	        trees.add(tree);
	    }

}
