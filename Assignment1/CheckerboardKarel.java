/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public void run() {
		while(frontIsClear()) {
			xoBeeper();
			moveAround();
		}
	}
	
	// put beeper in a line with 
	// one space between each one
	private void xoBeeper() {
		putBeeper();
		while(frontIsClear()) {
			move();
			if(frontIsClear()) {
				move();
				putBeeper();
			}
		}
	}	
	
	// if reach the end of the row
	// move to the next row
	// and determine to turn left or right
	private void whereToTurn() {
		if(facingEast()) {
			turnLeft();
			if(frontIsClear()) {
				move();
				turnLeft();
			}
		} else if (facingWest()) {
			turnRight();
			if(frontIsClear()) {
				move();
				turnRight();
			}
		}
	}
	
	// check whether or not the first step should be 
	// beeper or a space
	private void moveAround() {
		if (beepersPresent()) {
			whereToTurn();
			if(frontIsClear()) {
				move();
			}
		} else {
			whereToTurn();
		}
	}
}
	