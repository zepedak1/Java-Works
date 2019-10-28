import java.util.*;
import javax.swing.*;
public class CollegeStudent
{
    public String fname, lname;
    public int eday, emonth, eyear, gday, gmonth, gyear;
    public void setFirstName(String name)
    {
	fname = name;
    }
    public void setLastName(String name)
    {
	lname = name;
    }
    public void setEnrollmentDay(int day)
    {
	eday = day;
    }
    public void setEnrollmentMonth(int month)
    {
	emonth = month;
    }
    public void setEnrollmentYear(int year)
    {
	eyear = year;
    }
    public void setGraduationDay(int day)
    {
	gday = day;
    }
    public void setGraduationMonth(int month)
    {
	gmonth = month;
    }
    public void setGraduationYear(int year)
    {
	gyear= year;
    }
    public String getFirstName()
    {
	return fname;
    }
    public String getLastName()
    {
	return lname;
    }
    public int getEnrollmentDay()
    {
	return eday;
    }
    public int getEnrollmentMonth()
    {
	return emonth;
    }
    public int getEnrollmentYear()
    {
	return eyear;
    }
    public int getGraduationDay()
    {
	return gday;
    }
    public int getGraduationMonth()
    {
	return gmonth;
    }
    public int getGraduationYear()
    {
	return gyear;
    }
    public void constructInfo(String first, String last, int day, int month, int year)
    {
	fname = first;
	lname = last;
	eday = day;
	emonth = month;
	eyear = year;
	gday = day;
	gmonth = month;
	gyear = year + 4;
    }
}