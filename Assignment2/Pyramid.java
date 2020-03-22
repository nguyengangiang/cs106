/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		int canvasHeight = getHeight();
		int canvasWidth = getWidth();
		for (int line = BRICKS_IN_BASE; line > 0; line--) {
			int x_start = (canvasWidth - (line * BRICK_WIDTH)) / 2;
			for (int row = line; row > 0; row--) {
				int x = x_start + row*BRICK_WIDTH;
				int y = canvasHeight - (BRICKS_IN_BASE-line+1)*BRICK_HEIGHT;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
		}
	}
}

