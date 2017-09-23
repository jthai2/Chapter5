package exercises;

import java.util.Scanner;

public class CondoSales2 {

	public static void main(String[] args) {
		int viewChoice;
		int price;
		String view;
		final int parkView = 1;
		final int golfCourseView = 2;
		final int lakeView = 3;
		final String park = "park view";
		final String golf = "golf course view";
		final String lake = "lake view";

		Scanner input = new Scanner(System.in);
		
		System.out.println("Which condo do you want>>> " + parkView + ". " + park + " " + 
		golfCourseView + ". " + golf + " or " + lakeView	+ ". " + lake + ".");
		viewChoice = input.nextInt();
		

		switch (viewChoice) 
		{
		case parkView:
			view = park;
			price = 150000;
			break;
		case golfCourseView:
			view = golf;
			price = 170000;
			break;
		case lakeView:
			view = lake;
			price = 210000;
			break;
		default:
			view = "invalid";
			price = 0;
		}

		String garage = "You will get a parking space. ";
		if (viewChoice >= parkView && viewChoice <= lakeView) 
		{
			System.out.println("Would you like>>> 1. Garage or 2. Parking space?");
			int garageOrNot = input.nextInt();

			switch (garageOrNot) 
			{
			case 1:
				price += 5000;
				garage = "You will get a garage.";
				System.out.println(garage + " $5000 has been added.");
				break;
			case 2:
				System.out.println(garage);
				break;
			default:
				System.out.println("Input not recognized. " + garage);
			}

		System.out.println("\nYou chosen the condo with the " + view + " for $" + price + ".\n" + garage);
		}
	}
}
