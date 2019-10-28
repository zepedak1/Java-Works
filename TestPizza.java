public class TestPizza
{
    public static void main(String[] args)
    {
	String topping;
	int size;
	double price;
	Pizza pizza1 = new Pizza();
	pizza1.setTopping("Pepperoni");
	pizza1.setDiameter(12);
	pizza1.setPrice(13.99);
	topping = pizza1.getTopping();
	size = pizza1.getDiameter();
	price = pizza1.getPrice();
	System.out.println("The topping of the pizza is: " + topping);
	System.out.println("The size of the pizza is: " + size + " inches");
	System.out.println("The price of the pizza is: $" + price);
    }
}