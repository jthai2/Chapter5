package exercises;

import java.util.Scanner;

public class PizzaChoice2 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choiceYes, size, choiceHotDog;
	
		System.out.print("Would you like a pizza? Yes or No?>>>>> ");
		choiceYes = input.nextLine();
		
		if("Yes".equalsIgnoreCase(choiceYes) ||"Y".equalsIgnoreCase(choiceYes))
		{
			System.out.println("You said " + choiceYes + " to having pizza.");
			System.out.print("Please choose a size small, medium or large? >>>>");
			size = input.nextLine();
			if("small".equalsIgnoreCase(size))
			{
				displayPizzaSize(size);
				displayPizzaType();
				displayPizzaToppings();
				displayPrice(size);
			}
			if("medium".equalsIgnoreCase(size))
			{
				displayPizzaSize(size);
				displayPizzaType();
				displayPizzaToppings();
				displayPrice(size);
			}
			if("large".equalsIgnoreCase(size))
			{
				displayPizzaSize(size);
				displayPizzaType();
				displayPizzaToppings();
				displayPrice(size);
			}
		}
			if("No".equalsIgnoreCase(choiceYes) || "N".equalsIgnoreCase(choiceYes))
			{
				System.out.println("You don't want pizza. Would you want a hot dog instead?");
				choiceHotDog = input.next();
				if("Yes".equalsIgnoreCase(choiceHotDog) || "Y".equalsIgnoreCase(choiceHotDog))
				{
					System.out.println("Hog dog ordered. The price is $2.50.");
				}
				if("No".equalsIgnoreCase(choiceHotDog) || "N".equalsIgnoreCase(choiceHotDog))
				{
					System.out.println("I don't know what you want then...");
			}
		
			}
		}
	public static void displayPizzaSize(String size)
	{
		System.out.println("You said " + size + " pizza size.");
	}
	public static void displayPizzaType()
	{
		System.out.print("What kind of Pizza do you want? Pepperoni, Sausage, Cheese?");
		String pizzaKind = input.nextLine();
		if(("Pepperoni".equalsIgnoreCase(pizzaKind)|| "Sausage".equalsIgnoreCase(pizzaKind) || "Cheese".equalsIgnoreCase(pizzaKind)))
		{
			System.out.println("You said you want a " + pizzaKind + " type of pizza.");
		}
	}
	public static void displayPizzaToppings()
	{
		String toppingsChoice;
		System.out.println("Would you like an extra toppings? >>>>>");
		toppingsChoice = input.nextLine();
		if("Yes".equalsIgnoreCase(toppingsChoice) || "Y".equalsIgnoreCase(toppingsChoice))
		{
			System.out.println("You said you want extra toppings.");
		}
		if("No".equalsIgnoreCase(toppingsChoice))
		{
			System.out.println("You said you do not want extra toppings.");
		}
		System.out.println("Which other topping would you want? Cheese, pepperoni, or sausage. >>>>>");
		toppingsChoice = input.nextLine();
		if("Cheese".equalsIgnoreCase(toppingsChoice))
		{
			System.out.println("Cheese topping added.");
		}
		if("Pepperoni".equalsIgnoreCase(toppingsChoice))
		{
			System.out.println("Pepperoni topping added.");
		}
		if("Sausage".equalsIgnoreCase(toppingsChoice))
		{
			System.out.println("Sausage topping added.");
		}
	}
	public static void displayPrice(String size)
	{
		double mediumCost = 9.99;
		double largeCost = 12.99;
		double smallCost = 6.99;
		if("small".equalsIgnoreCase(size))
			System.out.print("Your total will be $" + smallCost + ".");
		if("medium".equalsIgnoreCase(size))
			System.out.print("Your total will be $" + mediumCost + ".");
		if("large".equalsIgnoreCase(size))
			System.out.print("Your total will be $" + largeCost + ".");
	}

}
