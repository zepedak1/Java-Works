public class DemoConstructor3
{
    public static void main(String[] args)
    {
        EventSite aSite = new EventSite(678);
        EventSite anotherSite = new EventSite();
	EventSite aThirdSite = new EventSite("Robin");
        System.out.println("Site number is " + aSite.getSiteNumber() + " Manager is " + aSite.getManager());
	System.out.println("Another site number is " + anotherSite.getSiteNumber() + " Manager is " + anotherSite.getManager());
	System.out.println("A third site number is " + aThirdSite.getSiteNumber() + " Manager is " + aThirdSite.getManager());
    }
}