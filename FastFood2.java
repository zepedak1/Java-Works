import javax.swing.JOptionPane;
public class FastFood2
{
    public static void main(String[] args)
    {
        String choice1string, choice2string, choice3string;
        double choice1, choice2, choice3, total = 0, cheeseburger = 4.99, pepsi = 2.00, chips = 0.75, cost1 = 0, cost2 = 0;
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
		cost1 = cheeseburger;
            }
        if(choice1 == 2)
            {
                total = pepsi;
		cost1 = pepsi;
            }
        if(choice1 == 3)
            {
                total = chips;
		cost1 = chips;
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
		cost2 = cheeseburger;
            }
        if(choice2 == 2)
            {
                total = total + pepsi;
		cost2 = cheeseburger;
            }
        if(choice2 == 3)
            {
                total = total + chips;
		cost2 = cheeseburger;
            }
	if(choice2 == choice1)
	    {
		total = total - cost1;
		cost2 = cost1;
	    }
        choice3string = JOptionPane.showInputDialog(null, "Choose your order:\n(1)Cheeseburger $4.99\n(2)Pepsi $2.00\n(3)Chips $0.75");
        choice3 = Double.parseDouble(choice3string);
	if(choice3 == choice2)
	    {
		JOptionPane.showMessageDialog(null, "Your total is: $" + total);
		System.exit(0);
	    }
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