public class DemoStaticField
{
    public static void main(String[] args)
    {
	EventSite site1 = new EventSite();
	EventSite site2 = new EventSite(123);
	EventSite site3 = new EventSite("Carmen");
	System.out.println("site1 #" + site1.getSiteNumber() + " " + site1.getManager() + "     " + site1.HEADQUARTERS);
	System.out.println("site2 #" + site2.getSiteNumber() + " " + site2.getManager() + "     " + site2.HEADQUARTERS);
	System.out.println("site3 #" + site3.getSiteNumber() + " " + site3.getManager() + "     " + site3.HEADQUARTERS);
    }
}