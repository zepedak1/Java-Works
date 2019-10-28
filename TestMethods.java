public class TestMethods
{
    public static void main(String[] args)
    {
	int variable1 = 10, variable2 = 20;
	displayIt(variable1, variable2);
	displayItTimesTwo(variable1, variable2);
	displayItPlusOneHundred(variable1, variable2);
    }
    public static void displayIt(int var1, int var2)
    {
	System.out.println("Display Variable 1: " + var1 + ", Display Varible 2: " + var2);
    }
    public static void displayItTimesTwo(int var1, int var2)
    {
	var1 = var1 * 2;
	var2 = var2 * 2;
	System.out.println("Display variable 1 multiplied by two: " + var1 + ", Display variable 2 multiplied by two: " + var2);
    }
    public static void displayItPlusOneHundred(int var1, int var2)
    {
	var1 = var1 + 100;
	var2 = var2 + 100;
	System.out.println("Display variable 1 plus 100: " + var1 + ", Display variable 2 plus 100: " + var2);
    }
}