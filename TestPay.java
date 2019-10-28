public class TestPay
{
    public static void main(String[] args)
    {
	Pay payment1 = new Pay();
	payment1.computeNetPay(30, 5.65, 0.15);
	payment1.computeNetPay(30, 5.65);
	payment1.computeNetPay(30);
    }
}