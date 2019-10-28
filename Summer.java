import java.util.*;
import javax.swing.*;
import java.lang.Math;
public class Summer
{
    public static void main(String[] args)
    {
	int nowdate;
	GregorianCalendar calendar = new GregorianCalendar();
	nowdate = calendar.get(Calendar.DAY_OF_YEAR);
	System.out.println(Math.abs(nowdate - 172) + 365);
    }
}