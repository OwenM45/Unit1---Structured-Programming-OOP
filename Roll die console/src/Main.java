import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		//ask the player for the max number
		System.out.println("Enter the max number generated");
		//sets up the buffer reader so console input can be used
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//gets the user input
		String userInput =  br.readLine();
		//convert the user input into a string
		int MaxNum = Integer.valueOf(userInput);
		
		//calls roll die function and passes in the max num variable
		RollDie(MaxNum);
	}
	
	public static void RollDie(int maxValue) throws IOException 
	{
		//creates a random number generator
		Random rand = new Random();
		//generates a random number
		int value = rand.nextInt(maxValue); 
		//prints the random number to console
		System.out.println(String.valueOf(value));
		//loops the program
		main(null);
	}
}
