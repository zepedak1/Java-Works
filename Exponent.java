public class Exponent
{
    public static void main(String[] args)
    {
	int variable = 10, squared, cubed;
	squared = squareNumber(variable);
	cubed = cubedNumber(variable);
	System.out.println("The variable squared is: " + squared);
	System.out.println("The variable cubed is: " + cubed);
    }
    public static int squareNumber(int num)
    {
	num = num * num;
	return num;
    }
    public static int cubedNumber(int num)
    {
	num = num * num * num;
	return num;
    }
}