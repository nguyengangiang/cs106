package lecture;

import acm.program.*;

public class factorial extends ConsoleProgram{
	private static final int MAX_NUM = 10;
	public void run() {
		for (int i = 0; i < MAX_NUM; i++) {
			println(i + " = " + factorial_func(i));
		}
	}
	private int factorial_func (int n) {
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

}
