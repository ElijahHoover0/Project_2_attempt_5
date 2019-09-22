import java.util.Scanner;

public class Polling_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		String[] topics = new String[5];
		int[][] responses = new int [5][10];
		int numUsers;
		int userScore;
		double averageImp;
		double totalScore;
		double lowestAverage = -1.0;
		double highestAverage = 11.0;
		int highestAverageNum = 0;
		int lowestAverageNum = 0;
		
		topics[0] = "How important is automation in jobs to you?";
		topics[1] = "How important is infrastructure to you?";
		topics[2] = "How important is social security to you?";
		topics[3] = "How important is job security to you?";
		topics[4] = "How important is the use of the death penalty to you?";
		
		System.out.println("How many people will be using the program?");
		numUsers = scnr.nextInt();
		
		for(int i=0;i<numUsers;i++) {
			System.out.println("User " + (i+1) + " Please respond now");
			for(int j=0;j<5;j++) {
				System.out.println("Please rate on a scale of 1-10: "+ topics[j]);
				userScore = scnr.nextInt();
				responses[j][userScore-1]++;
			}
		}
		
		System.out.println("_______|1    |2    |3    |4    |5    |6    |7    |8    |9    |10   |");
		for(int i=0;i<5;i++) {
			totalScore = 0.0;
			averageImp = 0.0;
			System.out.print("Issue " + (i+1) + "|");
			for(int j=0;j<10;j++) {
				System.out.print("" + responses[i][j] + "     ");
				totalScore = totalScore + (j+1) * responses[i][j];
			}
			averageImp = (totalScore + 0.0) / numUsers;
			System.out.println("average:" + averageImp);
			if(i == 0) {
				highestAverage = averageImp;
				lowestAverage = averageImp;
			}else {
				if(highestAverage < averageImp) {
					highestAverage = averageImp;
					highestAverageNum = i;
				}else if(lowestAverage > averageImp) {
					lowestAverage = averageImp;
					lowestAverageNum = i;
				}
			}
		}
		
		System.out.println("Issue "+(highestAverageNum + 1) + " had the highest average point total");
		System.out.println("Issue "+(lowestAverageNum + 1) + " had the lowest average point total");
		

	}

}
