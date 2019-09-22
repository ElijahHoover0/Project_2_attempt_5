import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int toDecrypt;
		double temp;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		
		//Gathers the users data
		System.out.println("Please enter the 4 number integer to decrypt");
		toDecrypt = scnr.nextInt();
		
		//Use the modulus to get the left most digit and add 7 then divide by 10, take whatever number is in the decimal place and give it to finalEncryption
		temp = ((toDecrypt / 1000) + 3) % 10;
		thirdDigit = (int)temp;
		
		//Divide by 100 then modulus 10 to grab the second digit
		temp = ((toDecrypt / 100 % 10) + 3) % 10;
		fourthDigit = (int)temp;
		
		//Divide by 10 then modulus 100 to grab the second digit
		temp = ((toDecrypt / 10 % 100) + 3) % 10;
		firstDigit = (int)temp;		
		
		//Divide by 10 then modulus 100 to grab the second digit
		temp = ((toDecrypt  % 1000) + 3) % 10;
		secondDigit = (int)temp;	
		
		System.out.println("The decrypted number is: " +firstDigit + ""+secondDigit + ""+thirdDigit + ""+fourthDigit);
	}

}
