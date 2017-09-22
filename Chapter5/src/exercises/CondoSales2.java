package exercises;

import javax.swing.JOptionPane;

public class CondoSales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int parkView = 150000;
		int golfCourseView = 170000;
		int lakeView = 210000;
		String usersChoiceString;
		int usersChoice;
		int price = 0;
		
		usersChoiceString = JOptionPane.showInputDialog(null, 
				"Choose 1 for park view, 2 for golf course view, and 3 for lake view\n1 - park view" +
		         "\n2 - golf course view" + "\n3 - lake view");
		usersChoice= Integer.parseInt(usersChoiceString);
		if(usersChoice == 1){
	         price = parkView;
	      }
		if(usersChoice == 2)
	      {
	         price = golfCourseView;
	         }
		if (usersChoice == 3)
		{
			price = price + lakeView;
		}
		usersChoiceString = JOptionPane.showInputDialog(null,"1 for garage or 2 for parking space:\n1 - garage\n2 - parking space");
		 usersChoice = Integer.parseInt(usersChoiceString);
		 if (usersChoice == 1)
	          price = price + 5000;
		 if (usersChoice == 2)
			 price = price;
		 JOptionPane.showMessageDialog(null,"The price of condominium is: $" + price);
		
	}

}
