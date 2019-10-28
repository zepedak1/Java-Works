import javax.swing.JOptionPane;
public class Calculate
{
    public static void main(String[] args)
    {
	String int1string, int2string, choicestring;
	int int1, int2, choice, total;
	int1string = JOptionPane.showInputDialog(null, "Insert first integer");
	int2string = JOptionPane.showInputDialog(null, "Insert second integer");
	choicestring = JOptionPane.showInputDialog(null, "Insert 1 to add the two intgeres \nInsert 2 to subtract the second integer from the first \nInsert 3 to multiply the integers");
	choice = Integer.parseInt(choicestring);
	int1 = Integer.parseInt(int1string);
	int2 = Integer.parseInt(int2string);
	switch(choice)
	    {
	    case 1:
		total = int1 + int2;
		JOptionPane.showMessageDialog(null, "Adding both integers results in: " + total);
		System.exit(0);
		break;
	    case 2:
		total = int1 - int2;
		JOptionPane.showMessageDialog(null, "Subtracting the second integer from the first results in: " + total);
		System.exit(0);
		break;
	    case 3:
		total = int1 * int2;
		JOptionPane.showMessageDialog(null, "Multiplying both integers results in: " + total);
		System.exit(0);
		break;
	    }
    }
}