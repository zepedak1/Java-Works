public class Calculator
{
    public static void main(String[] args)
    {
	double price, commission, discount, sale;
	price = 10.25;
	commission = price * 0.10;
	discount = price *  0.5;
	sale = calculation(price, commission, discount);
	System.out.println("The product's final price is: $" + sale);
    }
    public static double calculation(double price, double commission, double discount)
    {
	double sale;
	sale = price + commission + - discount;
	return sale;
    }
}