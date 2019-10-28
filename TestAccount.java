public class TestAccount
{
    public static void main(String[] args)
    {
	CheckingAccount account1 = new CheckingAccount();
	CheckingAccount account2 = new CheckingAccount();
	account1.Construct(1, 245.59);
	account2.Construct(2, 200.99);
    }
}