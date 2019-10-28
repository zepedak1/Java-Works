import javax.swing.JOptionPane;
public class Lawn2
{
    public static void main(String[] args)
    {   
	String lengthstring, widthstring, choicestring;
	double length, width, sqft, choice, mintotal = 25 * 20, midtotal = 35 * 20, maxtotal = 50 * 20;
	lengthstring = JOptionPane.showInputDialog(null, "Insert length of lawn");
	widthstring = JOptionPane.showInputDialog(null, "Insert width of lawn");
	choicestring = JOptionPane.showInputDialog(null, "Choose choice of Payment:\nInsert 1 to make one payment\nInsert 2 to make two payments\nInsert 3 to make 20 payments");
	length = Double.parseDouble(lengthstring);
	width = Double.parseDouble(widthstring);
	choice = Double.parseDouble(choicestring);
	sqft = length *width;
	if(sqft<= 400)
            {
		if(choice == 1)
		    {
			JOptionPane.showMessageDialog(null, "Number of payments: " + 1 + "\nAmount per payment: $" + mintotal + "\nTotal for the season is: $" + mintotal);
			System.exit(0);
		    }
		if(choice == 2)
		    {
			JOptionPane.showMessageDialog(null, "Number of payments: " + 2 + "\nAmount per payment: $" + ((mintotal / 2) + 5) + "\nTotal for the season is: $" + (mintotal + 10));
			System.exit(0);
		    }
		else
		    {
			JOptionPane.showMessageDialog(null, "Number of payments: " + 20 + "\nAmount per payment: $" + ((mintotal / 20) + 3) +  "\nTotal for the season is: $" + (mintotal + (3*20)));
			System.exit(0);
		    }
            }
        if(sqft > 400 && sqft < 600)
	    {
		if(choice == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Number of payments: " + 1 + "\nAmount per payment: $" + midtotal + "\nTotal for the season is: $" + midtotal);
                        System.exit(0);
                    }
                if(choice == 2)
                    {
                        JOptionPane.showMessageDialog(null, "Number of payments: " + 2 + "\nAmount per payment: $" + ((midtotal / 2) + 5) + "\nTotal for the season is: $" + (midtotal + 10));
                        System.exit(0);
		    }   
		else
                    {
			JOptionPane.showMessageDialog(null, "Number of payments: " + 20 + "\nAmount per payment: $" + ((midtotal/ 20) +  3) +"\nTotal for the season is: $" + (midtotal + (3*20)));
			System.exit(0);
		    }
	    }
	if(sqft >= 600)
	    {
		if(choice == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Number of payments: " + 1 + "\nAmount per payment: $" + maxtotal + "\nTotal for the season is: $" + maxtotal);
                        System.exit(0);
                    }
                if(choice == 2)
                    {
                        JOptionPane.showMessageDialog(null, "Number of payments: " + 2 + "\nAmount per payment: $" + ((maxtotal / 2) + 5) + "\nTotal for the season is: $" + (maxtotal + 10));
                        System.exit(0);
                    }
		else
		    {
			JOptionPane.showMessageDialog(null, "Number of payments: " + 20 + "\nAmount per payment: $" + ((maxtotal/ 20) +  3) +"\nTotal for the season is: $" + (maxtotal + (3*2)));
			System.exit(0);
		    }
	    }
    }
}