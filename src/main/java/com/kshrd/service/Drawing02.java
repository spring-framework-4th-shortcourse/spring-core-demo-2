package com.kshrd.service;

import com.kshrd.model.Circle;
import com.kshrd.model.Triangle;

//Approach#2
public class Drawing02 {

	private Circle circle;
	private Triangle triangle;

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	public void drawCircle(){
		System.out.println("Drawing " + circle.getType());
	}
	
	public void drawTriangle(){
		System.out.println("Drawing " + triangle.getType());
	}
}
