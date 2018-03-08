package studentADT;

public class Student 
{
	String fName;
	String mName;
	String lName;
	String grade;
	boolean asthma;
	boolean allergy;
	
	Student(String first, String middle, String last, String G, boolean as, boolean al)
	{
		fName = first;
		grade = G;
		mName = middle;
		lName = last;
		asthma = as;
		allergy = al;
	}
	
}
