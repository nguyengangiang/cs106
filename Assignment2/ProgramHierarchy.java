/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	private static final int BOX_LENGTH = 170;
	private static final int BOX_HEIGHT = 50;
	public void run() {
		// x coordinate of the middle of the canvas
		double x_middle = getWidth() / 2;
		
		// y coordinate of the top box
		double y_topBox = BOX_HEIGHT * 2.5;
		
		// x coordinate of the top box
		double x_middleBox = x_middle - BOX_LENGTH/2;
		
		// x coordinate of the first box in the second line
		double x_startSecondLine = (getWidth() - 3 * BOX_LENGTH) / 3;
		
		// y coordinate of the second box line
		double y_secondBoxLine = 5 * BOX_HEIGHT;
		
		// x coordinate of the last box in the second line
		double x_lastSecondLine = 2 * getWidth() / 3;
		
		// Program box
		drawBox(x_middleBox, y_topBox);

		// Program label
		drawLabel("Program", x_middleBox, y_topBox);
		
		// Graphics Program label
		drawLabel("Graphics Program", x_startSecondLine, y_secondBoxLine);
		
		// Graphics Program box
		drawBox(x_startSecondLine, y_secondBoxLine);

		// Console Program box
		drawBox(x_middleBox, y_secondBoxLine);
		
		// Console Program Label
		drawLabel("Console Program", x_middleBox, y_secondBoxLine);
		
		// Dialogue Program box
		drawBox(x_lastSecondLine, y_secondBoxLine);
		
		// Dialogue Program Label
		drawLabel("Dialog Program", x_lastSecondLine, y_secondBoxLine);
		
		// line points to graphic program
		drawLine(x_middleBox, y_topBox, x_startSecondLine, y_secondBoxLine);
		
		// line points to console program
		drawLine(x_middleBox, y_topBox, x_middleBox, y_secondBoxLine);
		
		// line points to dialog program
		drawLine(x_middleBox, y_topBox, x_lastSecondLine, y_secondBoxLine);

	}
	
	// draw a box on screen with given x and y coordinates
	private void drawBox(double x, double y) {
		GRect newBox = new GRect(x, y, BOX_LENGTH, BOX_HEIGHT);
		add(newBox);
	}
	
	// draw the label inside the box of the x and y coordinate
	private void drawLabel(String s, double x, double y) {
		GLabel newLabel = new GLabel(s);
		newLabel.setFont("SansSerif-17");
		newLabel.setLocation(x+((BOX_LENGTH - newLabel.getWidth())/2), y + ((BOX_HEIGHT + newLabel.getAscent())/2));
		add(newLabel);
	}
	
	// draw line starting from the bottom of the box of coordinate x1, y1
	// to the top of the box of coordinate x2, y2
	private void drawLine(double x1, double y1, double x2, double y2) {
		GLine newLine = new GLine((x1 + BOX_LENGTH/2), (y1 + BOX_HEIGHT), (x2 + BOX_LENGTH/2), (y2));
		add(newLine);
	}
}

