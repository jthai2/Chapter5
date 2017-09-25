package exercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number>>> ");
		number = input.nextInt();
		
		if( (number % 2) == 0)
		{
			System.out.println("Your number was even");
		}
		else
			System.out.println("Your number is odd");

	}

}
