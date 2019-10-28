public class SetUpSite3
{
    public static void main(String[] args)
    {
        int currentYear = 2008;
        int age;
	EventSite oneSite = new EventSite();
	int number;
	oneSite.setSiteNumber(101);
	number = oneSite.getSiteNumber();

        statementOfPhilosophy();
        age = calculateAge(currentYear);
        System.out.println("Serving you for " + age + " years");
	System.out.println("The number of the event site is " + number);
    }
    public static void statementOfPhilosophy()
    {
        System.out.println("Event Handlers Incorporated is");
        System.out.println("dedicated to making your event");
        System.out.println("a most memorable one.");
    }
    public static int calculateAge(int currDate)
    {
        int originYear = 1977;
        int years;
        years = currDate - originYear;
        return years;
    }
}