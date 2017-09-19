package tutorials;

import java.util.Scanner;

public class EnterYourAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age? >>>>>");
		age = input.nextInt();
		
		if(age <= 18)
		{
			System.out.println("User is less than 18.");
		}
		if (age >= 23 & age <= 30)
		{
			System.out.println("Users age is greater than 23 and less than 30.");
		}
		if (age >= 31 & age <= 50)
		{
			System.out.println("Users age is greater than 31 and less than 50");
		}
		if (age >= 50 & age <= 65)
		{
			System.out.println("Users age is greater than 50 and less than 65");
		}
		if (age >= 66 & age <= 100)
		{
			System.out.println("Users age is greater than 66 and less than 100");
		}
	}

}
