import javax.swing.JOptionPane;
public class Lawn
{
    public static void main(String[] args)
    {
	String lengthstring, widthstring;
	double length, width, sqft;
	lengthstring = JOptionPane.showInputDialog(null, "Insert length of lawn");
	widthstring = JOptionPane.showInputDialog(null, "Insert width of lawn");
	length = Double.parseDouble(lengthstring);
	width = Double.parseDouble(widthstring);
	sqft = length * width;
	if(sqft <= 400)
	    {
		JOptionPane.showMessageDialog(null, "The weekly fee is: $25\nThe 20 week seasonal fee is: $" + (25 * 20));
		System.exit(0);
	    }
	if(sqft > 400 && sqft < 600)
	    {
		JOptionPane.showMessageDialog(null, "The weekly fee is: $35\nThe 20 week seasonal fee is: $" + (35 * 20));
		System.exit(0);
	    }
	if(sqft >= 600)
	    {
		JOptionPane.showMessageDialog(null, "The weekly fee is: $50\nThe 20 week seasonal fee is: $" + (50 * 20));
		System.exit(0);
	    }
    }
}