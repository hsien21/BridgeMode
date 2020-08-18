package com.bridge.circle;

import com.bridge.abs.Shape;
import com.bridge.inf.DrawAPI;

public class Circle extends Shape{
	private int x,y,radius;
	

	public Circle(Integer x,int y,int radius, DrawAPI drawAPI) {
		super(drawAPI);
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.radius = radius; 
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawAPI.drawCircle(radius, x, y);
	}

}
