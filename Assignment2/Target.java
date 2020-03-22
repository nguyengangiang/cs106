/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		double x_mid = getWidth() / 2;
		double y_mid = getHeight() / 2;
		
	    double x_outerCircle = x_mid - 72;
		double y_outerCircle = y_mid - 72;
		
		double x_whiteCircle = x_mid - 46.8;
		double y_whiteCircle = y_mid - 46.8;

		double x_innerCircle = x_mid - 21.6;
		double y_innerCircle = y_mid - 21.6;
		
		drawCircle(Color.RED, x_outerCircle, y_outerCircle, 144);
		drawCircle(Color.WHITE, x_whiteCircle, y_whiteCircle, 93.6);
		drawCircle(Color.RED, x_innerCircle, y_innerCircle, 43.2);
	}
	
	// draw circle of x, y coordinate and r radius in pixel
	private void drawCircle(Color c, double x, double y, double r) {
		GOval newCircle = new GOval(x, y, r, r);
		newCircle.setColor(c);
		newCircle.setFilled(true);
		newCircle.setFillColor(c);
		add(newCircle);
	}
}
