import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		double BMI;
		double weightUser;
		double heightUser;
		int imperialOrMetric;
		
		
		System.out.println("Do you want to use Imperial(1) or Metric system(2) to calculate BMI?");
		imperialOrMetric = scnr.nextInt();
		
		if(imperialOrMetric == 1) {
			System.out.println("Please enter your weight in pounds:");
			weightUser = scnr.nextDouble();
			System.out.println("Please enter your height in inches");
			heightUser = scnr.nextDouble();
			BMI = ( 703 * weightUser / Math.pow(heightUser, 2));
			System.out.printf("your BMI is %.2f. Here are the different BMI categories:\nUnderweight = <18.5\nNormal weight = 18.5–24.9\nOverweight = 25–29.9\nObesity = BMI of 30 or greater", BMI);
		}else if(imperialOrMetric == 2) {
			System.out.println("Please enter your weight in kilograms:");
			weightUser = scnr.nextDouble();
			System.out.println("Please enter your height in meters");
			heightUser = scnr.nextDouble();
			BMI = ( weightUser / Math.pow(heightUser, 2));
			System.out.printf("your BMI is %.2f. Here are the different BMI categories:\nUnderweight = <18.5\nNormal weight = 18.5–24.9\nOverweight = 25–29.9\nObesity = BMI of 30 or greater", BMI);
			
		}else {
			System.out.println("Sorry, you didn't enter a valid option, please try again.");
			
		}
	}

}
