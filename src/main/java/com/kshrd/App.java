package com.kshrd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kshrd.configuration.BeanConfiguration;
import com.kshrd.model.Circle;
import com.kshrd.service.Drawing;
import com.kshrd.service.Drawing01;
import com.kshrd.service.Drawing02;

public class App {
	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext ctx = 
		//		new ClassPathXmlApplicationContext("drawingContext.xml");
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Drawing drawing = ctx.getBean(Drawing.class);
		drawing.draw();
		
		/*
		 * 
		//Approach#1
		Drawing01 d1 = ctx.getBean(Drawing01.class);
		d1.draw();
		
		//Approach#2
		Drawing02 d2 = ctx.getBean(Drawing02.class);
		d2.drawCircle();
		d2.drawTriangle();
		
		*/
	}
	
}
