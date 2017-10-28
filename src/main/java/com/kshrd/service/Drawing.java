package com.kshrd.service;

import com.kshrd.model.Shape;

public class Drawing {
	
	private Shape shape;
	
	public Drawing(Shape shape){
		this.shape = shape;
	}

	public void draw(){
		System.out.println("Drawing " + shape.getType());
	}
}
