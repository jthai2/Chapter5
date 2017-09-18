package tutorials;

import javax.swing.JOptionPane;

//Door Choice
public class DoorChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Door Prize program
		String choiceString;
		int doorChoice;
		
		choiceString = JOptionPane.showInputDialog(null, "pick a door any door, 1, 2, or 3.", 
				"Door Choice", JOptionPane.INFORMATION_MESSAGE);
		doorChoice = Integer.parseInt(choiceString);
		
		//if statement structure for door choice
		if(doorChoice == 1)
		{
			JOptionPane.showMessageDialog(null, "You win Nothing|| HAHAHAHAH!");
		}
		if(doorChoice == 2)
		{
			JOptionPane.showMessageDialog(null, "You win less than NOTHING! HAHAHAHHAHAHAHHAHAHAHAHAHA");
		}
		if (doorChoice == 3)
		{
			JOptionPane.showMessageDialog(null, "You win a brand new Huffy Bike! HAHAHHAHA");
		}
		if(doorChoice == 999)
		{
			JOptionPane.showMessageDialog(null,  "You win the state of Iowa, the whole state.");
		}
		else
			JOptionPane.showMessageDialog(null, "That number was not an option, I said 1-3.  ");
	}

}
