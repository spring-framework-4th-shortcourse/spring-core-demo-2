package com.kshrd.service;

import com.kshrd.model.Triangle;

//Approach#1
public class Drawing01 {

	private Triangle traingle;

	public Drawing01(Triangle traingle) {
		this.traingle = traingle;
	}

	public void draw() {
		System.out.println("Drawing " + traingle.getType());
	}

}
