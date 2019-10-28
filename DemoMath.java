public class DemoMath
{
    public static void main(String[] args)
    {
	double val = 26.9;
	System.out.println("The value is " + val);
	System.out.print("Absolute value of val is ");
	System.out.println(Math.abs(val));
	System.out.print("Absolute value of -val is ");
	System.out.println(Math.abs(val));
	System.out.print("The square root of val is ");
	System.out.println(Math.sqrt(val));
	System.out.print("Val rounded is ");
	System.out.println(Math.round(val));
	System.out.print("A random number is ");
	System.out.println(Math.random());
	System.out.print("8.0 raised to the power of 2 is ");
	System.out.println(Math.pow(8.0, 2));
    }
}