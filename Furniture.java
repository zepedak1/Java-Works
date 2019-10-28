import javax.swing.JOptionPane;
public class Furniture
{
    public static void main(String[] args)
    {
	String decisionstring, sizestring;
	int decision, size;
	decisionstring = JOptionPane.showInputDialog(null, "Enter 1 for Pine table, 2 for oak table, or 3 for mahogany table");
	decision = Integer.parseInt(decisionstring);
	switch(decision)
	    {
	    case 1:
		JOptionPane.showMessageDialog(null, "The Pine table costs $100");
		break;
	    case 2:
		JOptionPane.showMessageDialog(null, "The Oak table costs $225");
		break;
	    case 3:
		JOptionPane.showMessageDialog(null, "The Mahogany table costs $310");
		break;
	    default:
		JOptionPane.showMessageDialog(null, "Invalid entry, cost is $0");
	    }
	System.exit(0);
    }
}
	