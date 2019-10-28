import javax.swing.JOptionPane;
public class ComputeNet2
{
    public static void main(String[] args)
    {   
	String payratestring, hoursstring;
	double payrate, hours, grosspay, percent = 0, tax, netpay;
	payratestring = JOptionPane.showInputDialog(null, "Insert payrate:");
	hoursstring = JOptionPane.showInputDialog(null,"Insert hours worked:");
	payrate = Double.parseDouble(payratestring);
	hours = Double.parseDouble(hoursstring);
	grosspay = hours * payrate;
        if(grosspay >= 0)
	    percent = 0.10;
	if(grosspay >= 300.01)
	    percent = 0.12;
	if(grosspay >= 400.01)
	    percent = 0.15;
	if(grosspay >= 500.01)
	    percent = 0.20;
	tax = grosspay * percent;
	netpay = grosspay - tax;
	JOptionPane.showMessageDialog(null, "Gross Pay: " + grosspay + "\nWithholding tax: " + tax + "\nNetPay: " + netpay);
	System.exit(0);
    }   
}
