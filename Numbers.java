public class Numbers
{
    public static void main(String[] args)
    {
	int variable1 = 5, variable2 = 10;
	sum(variable1, variable2);
	difference(variable1, variable2);
    }
    public static void sum(int var1, int var2)
    {
	int sum = var1 + var2;
	System.out.println("The sum of both variables is: " + sum);
    }
    public static void difference(int var1, int var2)
    {
	int difference = var1 - var2;
	System.out.println("The difference of both variables is: " + difference);
    }
}