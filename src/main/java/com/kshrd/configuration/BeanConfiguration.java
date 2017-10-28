package com.kshrd.configuration;

import org.springframework.context.annotation.Bean;

import com.kshrd.model.Circle;
import com.kshrd.model.Polygon;
import com.kshrd.model.Triangle;
import com.kshrd.service.Drawing;
import com.kshrd.service.Drawing01;
import com.kshrd.service.Drawing02;

public class BeanConfiguration {
	
	@Bean
	public Triangle triangle() {
		return new Triangle();
	}

	@Bean
	public Circle circle() {
		return new Circle();
	}

	@Bean
	public Polygon polygon() {
		return new Polygon();
	}

	@Bean
	public Drawing drawing() {
		Drawing drawing = new Drawing(polygon());
		return drawing;
	}
	
	/*
	//Approach#1
	@Bean
	public Drawing01 d1(){
		Drawing01 d1 = new Drawing01(triangle());
		return d1;
	}
	
	//Approach#2
	@Bean
	public Drawing02 d2(){
		Drawing02 d2 = new Drawing02();
		d2.setCircle(circle());
		d2.setTriangle(triangle());
		return d2;
	}
	*/
}
