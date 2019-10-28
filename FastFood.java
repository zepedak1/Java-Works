import javax.swing.JOptionPane;
public class FastFood
{
    public static void main(String[] args)
    {
	String choice1string, choice2string, choice3string;
	double choice1, choice2, choice3, total = 0, cheeseburger = 4.99, pepsi = 2.00, chips = 0.75;
	choice1string = JOptionPane.showInputDialog(null, "Choose your order:\n(1)Cheeseburger $4.99\n(2)Pepsi $2.00\n(3)Chips $0.75\n(0)Quit the application");
	choice1 = Double.parseDouble(choice1string);
	if(choice1 == 0)
	    {
		JOptionPane.showMessageDialog(null, "Your total is: $" + total);
		System.exit(0);
	    }
	if(choice1 == 1)
	    {
		total = cheeseburger;
	    }
	if(choice1 == 2)
	    {
		total = pepsi;
	    }
	if(choice1 == 3)
	    {
		total = chips;
	    }
	choice2string = JOptionPane.showInputDialog(null, "Choose your order:\n(1)Cheeseburger $4.99\n(2)Pepsi $2.00\n(3)Chips $0.75");
	choice2 = Double.parseDouble(choice2string);
	if(choice2 == 0)
	    {
		JOptionPane.showMessageDialog(null, "Your total is : $" + total);
		System.exit(0);
	    }
	if(choice2 == 1)
	    {
		total = total + cheeseburger;
	    }
	if(choice2 == 2)
	    {
		total = total + pepsi;
	    }
	if(choice2 == 3)
	    {
		total = total + chips;
	    }
	choice3string = JOptionPane.showInputDialog(null, "Choose your order:\n(1)Cheeseburger $4.99\n(2)Pepsi $2.00\n(3)Chips $0.75");
	choice3 = Double.parseDouble(choice3string);
	if(choice3 == 0)
	    {
		JOptionPane.showMessageDialog(null, "Your total is: $" + total);
		System.exit(0);
	    }
	if(choice3 == 1)
	    {
		total = total + cheeseburger;
		JOptionPane.showMessageDialog(null, "Your total is: $" + total);
		System.exit(0);
	    }
	if(choice3 == 2)
	    {
		total = total + pepsi;
		JOptionPane.showMessageDialog(null, "Your total is: $" + total);
		System.exit(0);
	    }
	if(choice3 == 3)
	    {
		total = total + chips;
		JOptionPane.showMessageDialog(null, "Your total is: $" + total);
		System.exit(0);
	    }
    }
}