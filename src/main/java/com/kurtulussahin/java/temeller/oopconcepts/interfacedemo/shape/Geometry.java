package com.kurtulussahin.java.temeller.oopconcepts.interfacedemo.shape;

public class Geometry {
	
	public void drawShape(Shape shape){
		shape.draw();
	}
	
	public void eraseShape(Shape shape){
		shape.erase();
	}
}
