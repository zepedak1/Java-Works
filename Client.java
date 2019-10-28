public class Client
{
    private int clientnumber, ID;
    private String firstname, lastname;
    private double balance;
    public void setClientNumber(int number)
    {
	clientnumber = number;
    }
    public void setID(int number)
    {
	ID = number;
    }
    public void setFirstName(String name)
    {
	firstname = name;
    }
    public void setLastName(String name)
    {
	lastname = name;
    }
    public void setBalance(double number)
    {
	balance = number;
    }
    public int getClientNumber()
    {
	return clientnumber;
    }
    public int getID()
    {
	return ID;
    }
    public String getFirstName()
    {
	return firstname;
    }
    public String getLastName()
    {
	return lastname;
    }
    public double getBalance()
    {
	return balance;
    }
}