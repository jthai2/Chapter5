package exercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		int low, medium, high;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number>>> ");
		a = input.nextInt();
		
		System.out.println("Please enter another number>>> ");
		b = input.nextInt();
		
		System.out.println("Please enter one more number>>> ");
		c = input.nextInt();
		
		if(a >= b && a >= c) {
			high = a;
	}
		else 
			if(b >= a && b >=c) {
				high = b;
			}
			else
			{
				high = c;
			}
		
		if(a >= b && a <= c) {
			 medium = a;
			}
		 else 
			 if(b >= a && b<= c) {
			 	medium = b;
			}
			else 
			 	if(b <= a && b >= c)
			 	{
			 	medium = b; 
			 	}
			 else
			 	{
			 	medium = a; 
			 	}
		
		if(a <= b && a <= c) {
			 low = a;
			}
		else 
			if(b <= a && b <= c) {
			 	low = b; 
			 	}
			  else
			 	{
			 	low = c; 
			 	}
			 	System.out.print("Highest number to lowest is: " + high + ", " + medium + ", " + low);
		}
}
