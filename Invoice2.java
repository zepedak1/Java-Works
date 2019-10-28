public class Invoice2
{
    private int number, month = 0, day = 0, year = 0;
    private double balance;
    public void setInvoice(int number)
    {
        if(number < 1000)
            this.number = 0;
        else
            this.number = number;
    }
    public void setBalance(double number)
    {
        balance = number;
    }
    public void setMonth(int number)
    {
        if(number < 1 || number > 12)
            month = 0;
        else
            month = number;
    }
    public void setDay(int number)
    {
        if(month == 0)
	    day = 0;
	else
	    day = number;
	if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
	    if(number < 0 || number > 31)
		number = 0;
	    else 
		day = number;
	if(month == 4 || month == 6 || month == 9 || month == 11)
	    if(number < 0 || number > 30)
		number = 0;
	    else
		day = number;
	if(month == 2)
	    if(number < 0 || number > 28)
		number = 0;
	    else 
		day = number;
    }
    public void setYear(int number)
    {
        if(number < 2005 || number > 2012)
            year = 0;
        else
            year = number;
    }
    public int getInvoice()
    {
        return number;
    }
    public double getBalance()
    {
        return balance;
    }
    public int getMonth()
    {
        return month;
    }
    public int getDay()
    {
        return day;
    }
    public int getYear()
    {
	return year;
    }
}