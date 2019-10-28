import javax.swing.JOptionPane;
public class Furniture2
{
    public static void main(String[] args)
    {
        String decisionstring, sizestring;
        int decision, size;
        decisionstring = JOptionPane.showInputDialog(null, "Enter 1 for Pine table, 2 for oak table, or 3 for mahogany table");
        decision = Integer.parseInt(decisionstring);
	sizestring = JOptionPane.showInputDialog(null, "Enter 1 for large table or 2 for small table");
	size = Integer.parseInt(sizestring);
        if(decision == 1 && size == 2)
	    {
		JOptionPane.showMessageDialog(null, "The cost of the table is $100");
		System.exit(0);
	    }
	else 
	    {
		JOptionPane.showMessageDialog(null, "The cost of the table is $135");
		System.exit(0);
	    }
	if(decision == 2 && size == 2)
	    {
		JOptionPane.showMessageDialog(null, "The cost of the table is $225");
		System.exit(0);
	    }
	else 
	    {
		JOptionPane.showMessageDialog(null, "The cost of the table is $260");
		System.exit(0);
	    }
	if(decision == 3 && size == 2)
	    {
		JOptionPane.showMessageDialog(null, "The cost of the table is $310");
		System.exit(0);
	    }
	else 
	    {
		JOptionPane.showMessageDialog(null, "The cost of the table is $345");
		System.exit(0);
	    }
    }
}