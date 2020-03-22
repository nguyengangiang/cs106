/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		println("This program finds the largest and smallest numbers.");
		int i = readInt(" ? ");
		int max = i;
		int min = i;
		
		if (i == 0) {
			println("No value has been entered.");
		} else {
			while (i != 0) {
				if (i > max) {
					max = i;
				}
				if (i < min ) {
					min = i;
				}
				i = readInt(" ? ");
			}
			println("smallest: " + min);
			println("largest: " + max);
		}
	}
}

