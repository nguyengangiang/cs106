/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run() {
		turnLeft();		
		putBeeperToWall();
		turnRight();
		moveToNext();
		turnRight();
		putBeeperToWall();
		turnLeft(); 
		moveToNext();
		turnLeft();
		putBeeperToWall();
		turnRight();
		moveToNext();
		turnRight();
		putBeeperToWall();
	}
	
	// Put beeper is no beeper is present and then
	// move till reach wall
	private void putBeeperToWall() {
		if(noBeepersPresent()) {
			putBeeper();
		}
		while(frontIsClear()) {
			move();
			if(noBeepersPresent()) {
				putBeeper();
			} 
		}
	}
	
	/* move to the next row, which is 4
	 * steps away
	 */
	private void moveToNext() {
		for (int i = 0; i < 4; i++) {
			move();
		}
	}
}