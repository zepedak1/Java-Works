public class Divide
{
    public static void main(String[] args)
    {   
	int number1 = 1250, number2 = 12;
	divide(number1, number2);
    }   
    public static void divide(int number1, int number2)
    {
	int total = number1 / number2, remainder = number1 % number2;
	System.out.println("The value of " + number1 + " divided by " + number2 + " is: " + total);
	System.out.println("The remainder is: " +remainder);
    }   
}