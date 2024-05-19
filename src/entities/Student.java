package entities;

public class Student {

	public String name;
	public double gradeA;
	public double gradeB;
	public double gradeC;
	
	public double finalGrade() {
		return gradeA + gradeB + gradeC;
	}
	
	public String toString() {
		String msg = "FINAL GRADE = "
				+ String.format("%.2f%n", finalGrade());
		if (finalGrade() >= 60.0) {
			msg += "PASS";
		}
		else {
			msg += "FAILED\n"
				+ "MISSING "
				+ String.format("%.2f", 60.0 - finalGrade())
				+ " POINTS";
		}
		return msg;
	}
}
