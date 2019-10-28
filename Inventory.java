public class Inventory
{
    public static void main(String[] args)
    {
	String itemname;
	int itemnumber, quantity;
	double unitprice, totalvalue;
	itemname = "Gloves";
	itemnumber = 213;
	quantity = 50;
	unitprice = 5.25;
	totalvalue = quantity * unitprice;
	System.out.println("Item: " + itemname);
	System.out.println("Itemnumber: " + itemnumber);
	System.out.println("Quantity: " + quantity);
	System.out.println("Unit price: " + unitprice);
	System.out.println("Total value: $" + totalvalue);
    }
}