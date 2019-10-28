public class TwelveDays
{
    public static void main(String[] args)
    {
	int days = 12;
	System.out.println("On the twelth day of Christmas my true love gave to me!");
	switch(days)
	    {
	    case 12:
		System.out.println("12 drummers drumming");
		days = days - 1;
	    case 11:
		System.out.println("11 pipers piping");
		days = days - 1;
	    case 10:
		System.out.println("10 lords a leaping");
		days = days - 1;
	    case 9:
		System.out.println("9 ladies dancing");
		days = days - 1;
	    case 8:
		System.out.println("8 maids a milking");
		days = days - 1;
	    case 7:
		System.out.println("7 swans a swimming");
		days = days - 1;
	    case 6:
		System.out.println("6 geese a laying");
		days = days - 1;
	    case 5:
		System.out.println("5 gold rings, badam-pam-pam");
		days = days - 1;
	    case 4:
		System.out.println("4 calling birds");
		days = days - 1;
	    case 3:
		System.out.println("3 french hens");
		days = days - 1;
	    case 2:
		System.out.println("2 turtle doves");
		days = days - 1;
	    case 1:
		System.out.println("And a partridge in a pear tree");
		break;
	    }
    }
}
	    