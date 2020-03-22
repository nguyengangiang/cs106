package lecture;

import java.awt.*;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class RandomCircle extends GraphicsProgram {
	// set the maximum length for the radius
	private static final int MAX_RADIUS = 50;
	// set the minimum length for the radius
	private static final int MIN_RADIUS = 5;
	// set the number of circles to draw
	private static final int NUM_CIRCLES = 10;
	
	public void run() {
		for (int i = 0; i < NUM_CIRCLES; i++) {
			drawRandomCircle();
		}
	}
	
	private void drawRandomCircle() {
		// get random radius r
		double r = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
		
		// get random x and y coordinate
		double x = rgen.nextDouble(r, getWidth() - 2 * r);
		double y = rgen.nextDouble(r, getHeight() - 2 * r);
		
		// get random color for the circle
		Color c = rgen.nextColor();
		
		GOval circle = new GOval(x, y, 2 * r, 2 * r);
		circle.setFilled(true);
		circle.setFillColor(c);
		circle.setColor(c);
		add(circle);
		
	}
	private RandomGenerator rgen = RandomGenerator.getInstance();
}


