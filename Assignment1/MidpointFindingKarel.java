/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {	
	public void run() {
		putBeeperToEnd();
		turnAround();
		while (beepersPresent()) {
			move();
			if(beepersPresent()) {
				moveToEnd();
				putBeeperToNextSquare();
			}
		}
		putOneBeeperInTheMiddle();
	}
	
	private void putOneBeeperInTheMiddle() {
		turnAround();
		moveToNextBeeper();
		pickUpAllBeeper();
		putBeeper();
		move();
		if (beepersPresent()) {
			pickUpAllBeeper();
		}
		turnAround();
		move();
		turnAround();
	}

	private void pickUpAllBeeper() {
		while(beepersPresent())
			pickBeeper();
	}
	
	private void putBeeperToEnd() {
		putBeeper();
		while(frontIsClear()) {
			move();
			putBeeper();
		}
	}
	
	private void moveToEnd() {
		while(frontIsClear()) {
			move();
		}
		turnAround();
	}
	
	private void putBeeperToNextSquare() {
		moveToNextBeeper();
		pickBeeper();
		move();
		putBeeper();
	}
	
	private void moveToNextBeeper() {
		while(noBeepersPresent()) {
			move();
		}
	}
}
