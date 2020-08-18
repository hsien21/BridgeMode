package com.bridge;

import com.bridge.abs.Shape;
import com.bridge.circle.Circle;
import com.bridge.infimp.GreenCircle;
import com.bridge.infimp.RedCircle;

public class BridgePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape redCircle = new Circle(100,100,10,new RedCircle());
		Shape greenCircle = new Circle(100,100,10,new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
		
	}

}
