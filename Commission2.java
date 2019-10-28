public class Commission2
{
    public static void main(String[] args)
    {
        double sales, dcommission;
        int icommission;
        sales = 20;
        dcommission = 0.25;
        icommission = 25;
        computeCommission(sales, dcommission);
        computeCommission(sales, icommission);
	computeCommission(sales);
    }
    public static void computeCommission(double sales, double commission)
    {
        double total = sales * commission;
        System.out.println("The commission with double values is: " + total);
    }
    public static void computeCommission(double sales, int commission)
    {
        double total = (commission / 100) * sales;
        System.out.println("The commission with a double sales value and integer commission value is: " + total);
    }
    public static void computeCommission(double sales)
    {
	double total = sales * 7.5;
	System.out.println("The commission with a double sales value is: " + total);
    }
}