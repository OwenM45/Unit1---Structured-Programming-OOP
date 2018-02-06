import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoggingCompany {

	final static float MAX_WEIGHT = 1100;
	final static float LENGTH_ONE = 0.25f;
	final static float LENGTH_TWO = 0.5f;
	final static float LENGTH_THREE = 1.0f;
		
	static String userLength;
	static float numOfLogs;
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of the logs you've cut");
		String userLength = br.readLine();
		float length = Float.parseFloat(userLength);
		
		
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
			System.out.println("That is not a valid length");
		}
		
		main(null);
	}

}
