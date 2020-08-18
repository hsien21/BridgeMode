package com.bridge.abs;

import com.bridge.inf.DrawAPI;

public abstract class Shape {
	protected DrawAPI drawAPI;
	protected Shape(DrawAPI drawAPI) {
		this.drawAPI=drawAPI;
	}
	
	public abstract void draw();
}
