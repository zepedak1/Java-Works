public class TestInvoice3
{
    public static void main(String[] args)
    {
	Invoice3 invoice1 = new Invoice3();
	Invoice3 invoice2 = new Invoice3();
	invoice1.setInvoice(10001);
	invoice1.setBalance(100000000);
	invoice1.setYear(2008);
	invoice1.setMonth(2);
	invoice1.setDay(29);
	System.out.println("Correct Invoice Example:");
	System.out.println("Invoice: " + invoice1.getInvoice());
	System.out.println("Balance: " + invoice1.getBalance());
	System.out.println(invoice1.getMonth() + "/" + invoice1.getDay() + "/" + invoice1.getYear());
	System.out.println();
	invoice2.setInvoice(8);
	invoice2.setBalance(0);
	invoice2.setYear(2007);
	invoice2.setMonth(2);
	invoice2.setDay(29);
	System.out.println("Incorrect Invoice Example:");
	System.out.println("Invoice: " + invoice2.getInvoice());
	System.out.println("Balance: " + invoice2.getBalance());
	System.out.println(invoice2.getMonth() + "/" + invoice2.getDay() + "/" + invoice2.getYear());
    }
}