import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoggingCompany {

	//define constants
	final static float MAX_WEIGHT = 1100;
	final static float LENGTH_ONE = 0.25f;
	final static float LENGTH_TWO = 0.5f;
	final static float LENGTH_THREE = 1.0f;
	
	//define dynamic variables
	static String userLength;
	static float numOfLogs;
	
	public static void main(String[] args) throws IOException 
	{
		//sets up the buffer reader so console input can be used
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//asks the user a question
		System.out.println("Enter the length of the logs you've cut");
		//creates an input line
		String userLength = br.readLine();
		//turns the string answer into a float
		float length = Float.parseFloat(userLength);
		
		//Checks the user input and calculates how many logs can be transported
		if (length == LENGTH_ONE)
		{
			numOfLogs = MAX_WEIGHT/5;
			System.out.println(numOfLogs + " Logs can be transported");
		}
		else if (length == LENGTH_TWO)
		{
			numOfLogs = MAX_WEIGHT/10;
			System.out.println(numOfLogs + " Logs can be transported");
		}
		else if (length == LENGTH_THREE)
		{
			numOfLogs = MAX_WEIGHT/20;
			System.out.println(numOfLogs + " Logs can be transported");			
		}
		else 
		{
			//tells the user if there input was not one of the three options
			System.out.println("That is not a valid length");
		}
		
		//loops the program
		main(null);
	}

}
