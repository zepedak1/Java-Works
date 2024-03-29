public class TestInvoice
{
    public static void main(String[] args)
    {
	Invoice invoice1 = new Invoice();
	Invoice invoice2 = new Invoice();
	invoice1.setInvoice(1001);
	invoice1.setBalance(200);
	invoice1.setMonth(12);
	invoice1.setDay(1);
	invoice1.setYear(2006);
	System.out.println("Correct invoice example:");
	System.out.println("Invoice: " + invoice1.getInvoice());
	System.out.println("Balance: $" + invoice1.getBalance());
	System.out.println(invoice1.getMonth() + "/" + invoice1.getDay() + "/" + invoice1.getYear() + "\n");
	invoice2.setInvoice(5);
	invoice2.setBalance(0);
	invoice2.setMonth(15);
	invoice2.setDay(33);
	invoice2.setYear(2020);
	System.out.println("Wrong invoice example: ");
	System.out.println("Invoice: " + invoice2.getInvoice());
	System.out.println("Balance: $" + invoice2.getBalance());
	System.out.println(invoice2.getMonth() + "/" + invoice2.getDay() + "/" + invoice2.getYear());
    }
}