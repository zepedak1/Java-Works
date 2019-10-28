public class Interest
{
    public static void main(String[] args)
    {
	double futureamount, principal, rate, time;
	principal = 1000;
	rate = 0.05;
	time = 1;
	futureamount = principal * rate * time;
	System.out.println("Based on a princiapl of " + principal + ", a rate of " + rate * 100 + "%, and a time of " + 1 + " year; your money total would become:\n$" + (futureamount + principal));
    }
}