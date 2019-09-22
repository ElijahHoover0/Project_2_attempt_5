import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scnr = new Scanner(System.in);
		
		int toEncrypt;
		double temp;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		
		//Gathers the users data
		System.out.println("Please enter the 4 number integer to encrypt");
		toEncrypt = scnr.nextInt();
		
		//Divide by 1000 to get the left most digit and add 7 then divide by 10, take whatever number is in the decimal place and give it to finalEncryption
		temp = ((toEncrypt / 1000) + 7 ) % 10;
		thirdDigit = (int)temp;
		
		//Divide by 100 then modulus 10 to grab the second digit
		temp = ((toEncrypt / 100 % 10 ) + 7 ) % 10;
		fourthDigit = (int)temp;
		
		//Divide by 10 then modulus 100 to grab the second digit
		temp = ((toEncrypt / 10 % 100 ) + 7 ) % 10;
		firstDigit = (int)temp;	
		
		//Modulus 1000 to grab the first digit
		temp = ((toEncrypt  % 1000 ) + 7 ) % 10;
		secondDigit = (int)temp;	
		
		System.out.println("The encrypted number is: " +firstDigit + ""+secondDigit + ""+thirdDigit + ""+fourthDigit);
	}

}
