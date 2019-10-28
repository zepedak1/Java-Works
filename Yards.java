public class Yards
{
    public static void main(String[] args)
    {
	int length = 25, width = 42, feetToYard = 9, area;
	double cost = 13.25, total;
	area = length * width;
	area = area / feetToYard;
	total = cost * area;
	System.out.println("The area by yard is " + area);
	System.out.println("The total cost is $" + total);
    }
}
	