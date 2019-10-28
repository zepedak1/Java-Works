import javax.swing.JOptionPane;
public class TicketNumber
{
    public static void main(String[] args)
    {
	String number;
	int remainder, dropped, check;
	boolean test;
	number = JOptionPane.showInputDialog(null, "Enter your ticket number");
	check = Integer.parseInt(number);
	dropped = check % 10;
	check = check / 10;
	remainder = check % 7;
	test = (remainder == dropped);
	JOptionPane.showMessageDialog(null, test); 
	System.exit(0);
    }
}