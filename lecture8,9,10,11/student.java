package lecture;

public class student {
	public student (String name, int id) {
		studentName = name;
		studentID = id;
	}
	
	public String getName() {
		return studentName;
	}
	
	public int getID() {
		return studentID;
	}
	
	public void setUnits(double units) {
		unitsEarned = units;
	}
	
	public double getUnits() {
		return unitsEarned;
	}
	
	public void incrementUnit(double additionalUnits) {
		unitsEarned += additionalUnits;
	}
	
	public boolean haveEnoughUnits() {
		return (unitsEarned >= UNITS_TO_GRADUATE);
	}
	
	public String toString() {
		return studentName + " (0" + studentID + ")";
	}
	public static final double UNITS_TO_GRADUATE = 180.0;
	
	private String studentName;
	private int studentID;
	private double unitsEarned;
	 
}
