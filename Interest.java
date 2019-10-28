public class Interest
{
    public static void main(String[] args)
    {
	double value = 1000, percent = 0.05, time = 1, total;
	total = interest(value, percent, time);
	System.out.println("With an invested $" + value + ", an interest of " + percent + "% and a total time of " + time);
	System.out.println("Your total with interest is: " + total);
    }
    public static double interest(double value, double percent, double time)
    {
	double total;
	total = value * (1 + (percent * time));
	return total;
    }
}