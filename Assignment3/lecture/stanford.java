package lecture;

import acm.program.*;
public class stanford extends ConsoleProgram{ 
	
	public void run() {
		setFont("Times New Roman-20");
		
		student stud = new student("Ben Newman", 1001);
		stud.setUnits(179);
		
		println(stud.getName() + " has " + stud.getUnits() + " units");
		println(stud.getName() + " can graduate: " + stud.haveEnoughUnits());
		println(stud.getName() + " taken CS 106!");
		stud.incrementUnit(5);
		println(stud.getName() + " can graduate: " + stud.haveEnoughUnits());
		
		if (stud.haveEnoughUnits()) {
			println("Rock on " + stud.toString());
		}
	}

}
 