package gameZone;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R = 1;
		int P = 2;
		int S = 3;
		int choice;
		int computer;
		String computerChoice;
		
		System.out.println("Enter your choice >>>>>");
		choice = input.nextInt();
		
		Scanner input = new Scanner(System.in);
		Random generator = new Random(); 
		
		computer = generator.nextInt(3)+1;
		
		if (computer == 1) 
		       computerChoice = "R"; 
		   else if (computer == 2) 
		       computerChoice = "P"; 
		   else if (computer == 3) 
		       computerChoice = "S"; 

		
		if(1 == choice)
		{
			if(R==computer)
			{
				System.out.println("You tie");
			}
			else if(R==2)
				if(computer==S)
			{
				System.out.println("You lose");
			}
			else if(R==1)
				if(computer==S)
			{
				System.out.println("You win");
			}
		}
		if(2 == choice)
		{
			if(P==computer)
			{
				System.out.println("You tie");
			}
			else if(P==2)
				if(computer==1)
			{
				System.out.println("You lose");
			}
			else if(P==1)
				if(computer==3)
			{
				System.out.println("You win");
			}
		if(3 == choice)
		{
			if(S==computer)
			{
				System.out.println("You tie");
			}
			else if(S==2)
				if(computer==1)
			{
				System.out.println("You win");
			}
			else if(S==1)
				if(computer==2)
			{
				System.out.println("You lose");
			}
		}
		}
	}

}
