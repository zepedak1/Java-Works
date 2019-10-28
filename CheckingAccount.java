public class CheckingAccount
{
    public int account;
    public double balance;
    public static double minimum = 200.00;
    public void Construct(int account, double balance)
    {
	this.account = account;
	this.balance = balance;
	System.out.println("Account: #" + account);
	System.out.println("Balance: $" + balance);
	System.out.println("Minimum Balance: $" + minimum);
    }
}