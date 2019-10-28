public class Payroll
{
    public static void main(String[] args)
    {
	double hourlyRateofPay, hoursworked, grosspay, withholdingtax, netpay;
	hourlyRateofPay = 15;
	hoursworked = 8;
	grosspay = hourlyRateofPay * hoursworked;
	withholdingtax = grosspay * 0.15;
	netpay = grosspay - withholdingtax;
	System.out.println("Your grosspay is $" + grosspay);
	System.out.println("Your witholding tax is $" + withholdingtax);
	System.out.println("Your net pay is $" + netpay);
    }
}