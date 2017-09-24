package exercises;

import java.util.Scanner;

public class CondoSales2 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int viewChosen;
		
		System.out.println("Choose>>> 1. For park view 2. For golf course view or 3. For lake view.");
		viewChosen = input.nextInt();
		
		if(viewChosen == 1)
		{
			System.out.println("Park view condo chosen for $150,000.");
			garageOrParkingSpace();
		}
		else if(viewChosen == 2)
		{
			System.out.println("Golf course view condo chosen for $170,000.");
			garageOrParkingSpace();
		}
		else if(viewChosen == 3)
		{
			System.out.println("Lake view condo chosen for $210,000.");
			garageOrParkingSpace();
		}
		else
		{
			System.out.println("Price is $0");
		}
	}
	public static void garageOrParkingSpace() 
	{
		int choice;
		System.out.println("\nChoose>>> 1. For a garage or 2. For a parking space.");
		choice = input.nextInt();
		
		if(choice == 1)
		{
			System.out.println("$5,000 has been added to your total price");
		}
		if(choice == 2)
		{
			int parkingSpace;
			System.out.println("You chose parking space.");
			System.out.println("\nPlease choose the number for your parking space>>> 1-20 ");
			parkingSpace = input.nextInt();
			
			if(parkingSpace > 20 || parkingSpace < 1)
			{
				System.out.println("Parking space number invalid. Price has been reset to the cost of your condo.");
			}
			else
			{
				System.out.println("Parking space valid");
			}
			
		}
		
	}

}
