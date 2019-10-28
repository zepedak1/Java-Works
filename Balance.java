import javax.swing.JOptionPane;
public class Balance
{
    public static void main(String[] args)
    {
	String checkingstring, savingstring;
	double checking, savings;
	checkingstring = JOptionPane.showInputDialog(null, "Insert checking account balance");
	savingstring = JOptionPane.showInputDialog(null, "Insert savings account balance");
	checking = Double.parseDouble(checkingstring);
	savings = Double.parseDouble(savingstring);
	if(checking < 10)
	    JOptionPane.showMessageDialog(null, "Checking account balance is low");
	if(savings < 100)
	    JOptionPane.showMessageDialog(null, "Savings account balance is low");
	System.exit(0);
    }
}