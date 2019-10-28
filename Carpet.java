public class Carpet
{
    public static void main(String[] args)
    {
	int length = 10, width = 15, area; 
	double dollars = 13, cents = 0.25, cost, dollar;
	area = length * width;
	cost = (dollars * area) + (dollars * cents);
	System.out.println("The floor space is " + area + " square feet.");
	System.out.println("The cost will be $" + cost);
    }
}
	
	
	
	
	