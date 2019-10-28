public class TestInvoice
{
    public static void main(String[] args)
    {
	Invoice invoice1 = new Invoice();
	Invoice invoice2 = new Invoice();
	Invoice invoice3 = new Invoice();
	invoice1.setItemNumber(1);
	invoice2.setItemNumber(2);
	invoice3.setItemNumber(3);
	invoice1.setQuantity(20);
	invoice2.setQuantity(35);
	invoice3.setQuantity(15);
	invoice1.setName("Apples");
	invoice2.setName("Oranges");
	invoice3.setName("Mangos");
	invoice1.setPrice(1.50);
	invoice2.setPrice(1.00);
	invoice3.setPrice(2.00);
	invoice1.displayLine();
	invoice2.displayLine();
	invoice3.displayLine();
    }
}