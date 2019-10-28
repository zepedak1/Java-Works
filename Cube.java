public class Cube
{
    public static void main(String[] args)
    {
	int number = 10;
	number = cube(number);
	System.out.println("The number cubed is: " + number);
    }
    public static int cube(int num)
    {
	num = num * num * num;
	return num;
    }
}