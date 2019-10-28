public class Invoice
{
    private int itemnumber, quantity;
    private String name;
    private double price;
    public void setItemNumber(int number)
    {
	itemnumber = number;
    }
    public void setQuantity(int number)
    {
	quantity = number;
    }
    public void setName(String nombre)
    {
	name = nombre;
    }
    public void setPrice(double number)
    {
	price = number;
    }
    public int getItemNumber()
    {
	return itemnumber;
    }
    public int getQuantity()
    {
	return quantity;
    }
    public String getName()
    {
	return name;
    }
    public double getPrice()
    {
	return price;
    }
    public void displayLine()
    {
	double cost;
	cost = price * quantity;
	System.out.println("Item number: " + itemnumber);
	System.out.println("Name: " + name);
	System.out.println("Quantity: " + quantity);
	System.out.println("Price: $" + price);
	System.out.println("Total Cost: $" + cost);
    }
}