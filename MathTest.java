import java.lang.Math;
public class MathTest
{
    public static void main(String[] args)
    {
	System.out.println("The square root of 30 is: " + Math.sqrt(30));
	System.out.println("The sine of 100 is: " + Math.sin(100));
	System.out.println("The cos of 100 is: " + Math.cos(100));
	System.out.println("The floor of 44.7 is: " + Math.floor(44.7));
	System.out.println("The ceiling of 44.7 is: " + Math.ceil(44.7));
	System.out.println("The rounded value of 44.7 is: " + Math.round(44.7));
	System.out.println("The larger of the character K and integer 70 is: " + Math.max('K', 70));
	System.out.println("The smaller of the character K and integer 70 is: " + Math.min('K', 70));
	System.out.println("A random number between 0 and 10 is: " + (1 + (int)(Math.random() * 10)));
    }
}