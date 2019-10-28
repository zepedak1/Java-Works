public class Salary
{
    public static void main(String[] args)
    {
	double salary, wage = 25, hours = 40, overtime = 13;
	salary = pay(wage, hours, overtime);
	System.out.println("The salary is: $" + salary);
    }
    public static double pay(double wage, double hours, double overtime)
    {
	double total;
	total = (wage * hours) + ((wage * 1.5) * overtime);
	return total;
    }
}
	