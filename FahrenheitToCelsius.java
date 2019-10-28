public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
	double Fahrenheit, Celsius;
	Fahrenheit = 98.6;
	Celsius = (Fahrenheit - 32) * 5 / 9;
	System.out.println("The temperature in Fahrenheit is " + Fahrenheit);
	System.out.println("Fahrenheit temperature converted to Celsius is: " + Celsius);
    }
}
	