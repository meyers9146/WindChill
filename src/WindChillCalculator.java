import java.util.Scanner;

public class WindChillCalculator
{
	/** A program that requests weather conditions from the user in order to determine wind chill factor

	 */
	
	public static void main(String[] args)
	{		
		System.out.println("Wind Chill Calculator"); //Welcome header
		
		Scanner scanner = new Scanner(System.in); //Scanner object to read keyboard input
		double temp, windspeed, chillFactor; //variables to hold entered information
		final String PROGRAMMER_NAME = "Michael Meyers";
		
		
		//Request information from user
		System.out.print("Please enter the current temperature in degrees Fahrenheit (must be between -45 and 40:) ");
		temp = scanner.nextDouble();
		
		System.out.print("Please enter the current average windspeed in mph (must be between 5 and 60:) ");
		windspeed = scanner.nextDouble();
		
		scanner.close(); //scanner no longer needed
		
		//Calculate windchill factor
		final double SCALER = 35.74; //Constant from windchill formula
		chillFactor = SCALER + (0.6215 * temp) - (35.75 * Math.pow(windspeed, 0.16)) + (0.4275 * temp * Math.pow(windspeed, 0.16));
		
		//Display results
		System.out.printf("The wind chill is %.2f\n", chillFactor);
		System.out.println("Programmed by " + PROGRAMMER_NAME);
	}
}