import javax.swing.JOptionPane;
public class Admission2
{
    public static void main(String[] args)
    {   
	String gpastring, teststring;
	double gpa, test;
	gpastring = JOptionPane.showInputDialog(null, "Enter your gpa");
	teststring = JOptionPane.showInputDialog(null, "Enter test score from 0 to 100");
	gpa = Double.parseDouble(gpastring);
	test = Double.parseDouble(teststring);
	if(gpa >= 3.0 && test >= 60 || gpa < 3.0 && test >= 80)
	    {
		JOptionPane.showMessageDialog(null,"Accepted");
		System.exit(0);
	    }
	else if(gpa < 0 || gpa > 4.0 || test > 100 || test < 0)
	    {
		JOptionPane.showMessageDialog(null, "Error");
		System.exit(0);
	    }
	else
	    {
		JOptionPane.showMessageDialog(null, "Reject");
		System.exit(0);
	    }
    }
}
