public class Monogram
{
    public static void main(String[] args)
    {
	char firstInitial = 'K', middleInitial = 'A', lastInitial = 'Z';
	traditionalOrder(firstInitial, middleInitial, lastInitial);
	monogramStyle(firstInitial, middleInitial, lastInitial);
    }
    public static void traditionalOrder(char f, char m, char l)
    {
	System.out.println("Initials in order of first, middle, and last: " + f + m + l);
    }
    public static void monogramStyle(char f, char m, char l)
    {
	System.out.println("Initials in traditional monogram style: " + f + l + m);
    }
}