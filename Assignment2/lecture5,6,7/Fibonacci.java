package lecture;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static final int MAX_TERM_VAlUE = 21;
	public void run() {
		for (int i = 0; i < MAX_TERM_VAlUE; i++) {
			println("fib(" + i + ") = " + fib(i));
		}
	}
	
	public int fib(int i) {
		
		if (i == 0) {
			return 0;
		} else if (i == 1) {
			return 1;
		} else {
			return fib(i - 1) + fib(i - 2);
		}
	}
}
