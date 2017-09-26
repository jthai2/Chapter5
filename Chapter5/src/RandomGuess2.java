package gameZone;

import java.util.Scanner;

public class RandomGuess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guess;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a guess between 1-5 >>>");
		guess = input.nextInt();
		
		int random = 1 + (int)(Math.random() * 5);
		
		System.out.println("The number is " + random + ".");
		System.out.println("Your guess is " + guess + ".");
		
		if(guess == random)
		{
			System.out.println("Your guess was right.");
		}
		if(guess > random)
		{
			System.out.println("Your guess is too high.");
		}
		if(guess < random)
		{
			System.out.println("Your guess is too low");
		}
	}

}
