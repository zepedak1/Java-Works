import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class TestCollegeStudent
{
    public static void main(String[] args)
    {
	String firstname, lastname, daystring, monthstring, yearstring;
	int day, month, year;
	firstname = JOptionPane.showInputDialog(null, "What is your first name?", "First Name", JOptionPane.QUESTION_MESSAGE);
	lastname = JOptionPane.showInputDialog(null, "What is your last name?", "Last Name", JOptionPane.QUESTION_MESSAGE);
	daystring = JOptionPane.showInputDialog(null, "What day is your enrollment?", "Enrollment Day", JOptionPane.QUESTION_MESSAGE);
	monthstring = JOptionPane.showInputDialog(null, "What month is your enrollment?", "Enrollment Month", JOptionPane.QUESTION_MESSAGE);
	yearstring = JOptionPane.showInputDialog(null, "What year is your enrollment?", "Enrollment Year", JOptionPane.QUESTION_MESSAGE);
	day = Integer.parseInt(daystring);
	month = Integer.parseInt(monthstring);
	year = Integer.parseInt(yearstring);
	CollegeStudent student1 = new CollegeStudent();
	student1.constructInfo(firstname, lastname, day, month, year);
	JOptionPane.showMessageDialog(null,"Student info\nFirst name is: " + firstname + "\nLast name is: " + lastname + "\nEnrollment Date: " + month + "/" + day + "/" + year + "\nExpected Graduation Date: " + student1.getGraduationMonth() + "/" + student1.getGraduationDay() + "/" + student1.getGraduationYear());
    }
}