public class Time
{
    public static void main(String[] args)
    {
	int timeworked = 197, hours, minutes;
	hours = timeworked / 60;
	minutes  = timeworked % 60;
	System.out.println("Time worked is:\n" + hours + " hours");
	System.out.println(minutes + " minutes");
    }
}