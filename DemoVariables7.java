public class DemoVariables7
{
    public static void main(String[] args)
    {
        int oneInt = 315;
        short oneShort = 23;
        long oneLong = 1234567876543L;
        int value1 = 43, value2 = 10, sum, difference, product, quotient, modulus;
        boolean isProgrammingFun = true, isProgrammingHard = false;
        double doubNum1 = 2.3, doubNum2 = 14.8, doubResult;
	char myGrade = 'A', myFriendsGrade = 'C';
	System.out.println("Our grades are " + myGrade + " and " + myFriendsGrade);
        doubResult = doubNum1 + doubNum2;
        System.out.println("The sum of the doubles is " + doubResult);
        doubResult = doubNum1 * doubNum2;
        System.out.println("The product of the doubles is " + doubResult);
        System.out.println("The value of isProgrammingFun is " + isProgrammingFun);
        System.out.println("The value of isProgrammingHard is " + isProgrammingHard);
        sum = value1 + value2;
        difference = value1 - value2;
        product = value1 * value2;
        quotient = value1 / value2;
        modulus = value1 % value2;
        System.out.println("The int is " + oneInt);
        System.out.println("The short is " + oneShort);
        System.out.println("The long is " + oneLong);
        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + difference);
        System.out.println("Product is " + product);
        System.out.println("Quotient is " + quotient);
        System.out.println("Modulus is " + modulus);
    }
}