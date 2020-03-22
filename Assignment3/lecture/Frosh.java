package lecture;

public class Frosh extends student{
	public Frosh(String name, int id) {
		super(name, id);
		setUnits(0);
	}
	
	public String toString() {
		return ("Frosh: " + getName() + " (0" + getID() + ")");
	}
}
 