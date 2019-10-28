import javax.swing.JOptionPane;
public class IQ
{
    public static void main(String[] args)
    {
	String IQstring;
	double IQ;
	IQstring = JOptionPane.showInputDialog(null, "Insert your IQ");
	IQ = Double.parseDouble(IQstring);
	if(IQ > 200 || IQ < 0)
	    {
		JOptionPane.showMessageDialog(null, "Error invalid entry");
		System.exit(0);
	    }
	if(IQ < 100 && IQ >= 0)
	    {
		JOptionPane.showMessageDialog(null, "IQ is below average");
		System.exit(0);
	    }
	else if(IQ == 100)
	    {
		JOptionPane.showMessageDialog(null, "IQ is average");
		System.exit(0);
	    }
	else if(IQ > 100 && IQ <= 200)
	    {
		JOptionPane.showMessageDialog(null, "IQ is above average");
		System.exit(0);
	    }
    }
}