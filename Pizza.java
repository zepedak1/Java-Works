public class Pizza
{
    private String topping;
    private int diameter;
    private double price;
    public String getTopping()
    {
	return topping;
    }
    public int getDiameter()
    {
	return diameter;
    }
    public double getPrice()
    {
	return price;
    }
    public void setTopping(String top)
    {
	topping = top;
    }
    public void setDiameter(int size)
    {
	diameter = size;
    }
    public void setPrice(double cost)
    {
	price = cost;
    }
}