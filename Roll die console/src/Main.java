import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		System.out.println("Enter the max number generated");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String userInput =  br.readLine();
		int MaxNum = Integer.valueOf(userInput);
		
		RollDie(MaxNum);
	}
	
	public static void RollDie(int maxValue) throws IOException 
	{
		Random rand = new Random(); 
		int value = rand.nextInt(maxValue); 
		System.out.println(String.valueOf(value));
		main(null);
	}
}
