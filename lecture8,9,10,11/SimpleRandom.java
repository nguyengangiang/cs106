package lecture;

import acm.util.*;
import acm.program.*;

public class SimpleRandom extends ConsoleProgram{
	public void run() {
		rgen.setSeed(1);
		int diceRoll = rgen.nextInt(1, 6);
		println("You rolled " + diceRoll);
	
	}
	private RandomGenerator rgen = RandomGenerator.getInstance();

}
