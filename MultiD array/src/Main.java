import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException 
	{
				//sets up the buffer reader so console input can be used
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				//asks the user a question
				System.out.println("Enter the number of students");
				//creates an input line
				String stuInput = br.readLine();
				//turns the string answer into a float
				int stuNum = Integer.parseInt(stuInput);
				//asks the user a question
				System.out.println("Enter the number of assignments");
				//creates an input line
				String assignInput = br.readLine();
				//turns the string answer into a float
				int assignNum = Integer.parseInt(assignInput);
				
				int[][] stuGrades = new int[stuNum][assignNum];
				System.out.println(stuGrades.length);
				
	}
	
	public void getAverage(int[][] arrayIn) 
	{
		for (int i = 0; i < arrayIn.length;i++) 
		{
			
		}
	}

}
