public class Pay
{
    public double worked, rate, withholding, gross, net;
    public void computeNetPay(double hours, double payrate, double withholding)
    {
	this.gross = hours * payrate;
	this.net = this.gross - (this.gross * withholding);
	System.out.println("Net Pay given hours, payrate, and witholding is: " + this.net);
    }
    public void computeNetPay(double hours, double payrate)
    {
	double withholding = 0.15;
	this.gross = hours * payrate;
	this.net = this.gross - (this.gross * withholding);
	System.out.println("Net Pay given hours and payrate: " + this.net);
    }
    public void computeNetPay(double hours)
    {
	double withholding = 0.15, rate = 5.65;
	this.gross = hours * rate;
	this.net = this.gross - (this.gross * withholding);
	System.out.println("Net Pay given hours: " + this.net);
    }
}