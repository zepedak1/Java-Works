import javax.swing.JOptionPane;
public class PetAdvice
{
    public static void main(String[] args)
    {
	String residencestring, hoursstring;
	double hours, residence;
	residencestring = JOptionPane.showInputDialog(null, "Enter your residence as either: \n(1)House \n(2)Apartment  \n(3)Dormitory");
	hoursstring = JOptionPane.showInputDialog(null, "Enter the number of hours you are home: \n(1)18 or more \n(2)10 to 17 \n(3)8 to 9 \n(4)6 to 7 \n(5)0 to 5");
	hours = Double.parseDouble(hoursstring);
	residence = Double.parseDouble(residencestring);
	if(residence == 1)
	    {
		if(hours == 1)
		    {
			JOptionPane.showMessageDialog(null, "Recommendation: Pot-bellied pig");
			System.exit(0);
		    }
		if(hours == 2)
		    {
			JOptionPane.showMessageDialog(null, "Recommendation: Dog");
			System.exit(0);
		    }
		else
		    {
			JOptionPane.showMessageDialog(null, "Recommendation: Snake");
			System.exit(0);
		    }
	    }
	if(residence == 2)
	    {
		if(hours == 1 || hours == 2)
		    {
			JOptionPane.showMessageDialog(null, "Recommendation: Cat");
			System.exit(0);
		    }
		else
		    {
			JOptionPane.showMessageDialog(null, "Recommendation: Hamster");
			System.exit(0);
		    }
	    }
	else
	    {
		if(hours == 5)
		    {
			JOptionPane.showMessageDialog(null, "Recommendation: Ant farm");
			System.exit(0);
		    }
		else
		    {
			JOptionPane.showMessageDialog(null, "Recommendation: Fish");
			System.exit(0);
		    }
	    }
    }
}