import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Random;

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
				
				//generate student grades
				for (int i = 0; i < stuNum-1; i++) 
				{
					for (int j = 0; j < assignNum-1; j++)
					{
						Random rand = new Random(); 
						int value = rand.nextInt(100+1);
						stuGrades[i][j] = value; 
					}
				}
				
				//calls the get average function
				getAverage(stuGrades,assignNum);
				
	}
	
	public static void getAverage(int[][] arrayIn, int assign) throws IOException 
	{
		float sum = 0;
		
		//calculates the sum of all the student marks
		for (int i = 0; i < arrayIn.length-1; i++) 
		{
			for (int j = 0; j < assign-1; j++)
			{
				sum += arrayIn[i][j];
			}
		}
		//calculates the class average
		float average = sum/(arrayIn.length * assign);
		//prints the answer
		System.out.println("class average: " + average + "%");
		System.out.println("----------------------------------------------");
		main(null);
	}

}
