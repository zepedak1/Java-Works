import javax.swing.JOptionPane;
public class ComputeNet
{
    public static void main(String[] args)
    {
	String payratestring, hoursstring;
	double payrate, hours, grosspay, percent, tax, netpay;
	payratestring = JOptionPane.showInputDialog(null, "Insert payrate:");
	hoursstring = JOptionPane.showInputDialog(null, "Insert hours worked:");
	payrate = Double.parseDouble(payratestring);
	hours = Double.parseDouble(hoursstring);
	grosspay = hours * payrate;
	if(grosspay <= 300)
	    percent = 0.10;
	else
	    percent = 0.12;
	tax = grosspay * percent;
	netpay = grosspay - tax;
	JOptionPane.showMessageDialog(null, "Gross Pay: " + grosspay + "\nWithholding tax: " + tax + "\nNetPay: " + netpay);
	System.exit(0);
    }
}