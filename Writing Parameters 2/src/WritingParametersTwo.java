import java.util.Scanner;

public class WritingParametersTwo
	{

		public static void main(String[] args)
			{
				double feet= inputFeet();
				double inches= inputInches();
				double allInches = convertToInches(feet, inches);
				System.out.println("Your total height in all inches is " + allInches+ " inches.");
				double centimeters = convertToCentimeters(allInches);
				System.out.println("Your total height in all centimeters is " + centimeters+ " centimeters.");
				double meters = convertToMeters(centimeters);
				System.out.println("Your total height in all meters is " + meters+ " meters.");
				double metersToFeet= convertToFeet(meters);
				System.out.println("Your total height in all feet from meters is " + metersToFeet+ " feet.");
				double feetToInches= convertToInches(metersToFeet);
				System.out.println("Your total height in all inches from feet is " + feetToInches + " inches.");
				double heightInInches= outputHeightInInches(feetToInches);
				System.out.println("Your total height is " + heightInInches + " inches.");

			}
		public static double inputFeet()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("How tall are you in feet?");
		return userInput.nextDouble();
		}
		public static double inputInches()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("How tall are you remaining in inches?");
			return userInput.nextDouble();
			}
		public static double convertToInches(double f, double n)
			{
			return (f*12)+ n;
			}
		public static double convertToCentimeters(double aI)
		{
			return (aI*2.54);
		}
		public static double convertToMeters(double cent)
		{
			return (cent/100);
		}
		public static double convertToFeet(double met)
		{
			return (met*3.28);
		}
		public static double convertToInches(double feet)
		{
			return (feet*12);
		}
		public static double outputHeightInInches(double inch)
		{
			return (inch);
		}
		
	}
