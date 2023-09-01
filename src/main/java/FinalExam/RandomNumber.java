package FinalExam;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Random random = new Random();
		number = random.nextInt(500);
		int numbers [] = {1,2,3,   500};
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i = 1; i<numbers.length; i++)
			if(numbers[i]>largest) {
				largest = numbers[i];
				}
			else if(numbers[i]<smallest);{
				smallest = numbers[1];
			}
		System.out.println("Smallest numbes is: " + smallest);	
		
		System.out.println("Generated number between 1 and 500 : " + number);
	}
}
