import javax.swing.*;
import java.util.*;
public class YearEnd
{
    public static void main(String[] args)
    {
	int date;
	GregorianCalendar calendar = new GregorianCalendar();
	date = calendar.get(Calendar.DAY_OF_YEAR);
	System.out.println(365 - date);
    }
}