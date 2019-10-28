import javax.swing.JOptionPane;
public class MadLib
{
    public static void main(String[] args)
    {
	String noun1, noun2, adjective, verb, noun3;
	noun1 = JOptionPane.showInputDialog(null, "Enter a noun", "Noun", JOptionPane.INFORMATION_MESSAGE);
	noun2 = JOptionPane.showInputDialog(null, "Enter a noun", "Noun", JOptionPane.INFORMATION_MESSAGE);
	adjective = JOptionPane.showInputDialog(null, "Enter an adjective", "Adjective", JOptionPane.INFORMATION_MESSAGE);
	verb = JOptionPane.showInputDialog(null, "Enter a verb", "Verb", JOptionPane.INFORMATION_MESSAGE);
	System.out.println("Mary had a little " + noun1);
	System.out.println("Its " + noun2 + " was " + adjective + " as snow");
	System.out.println("And everywhere that Mary " + verb);
	System.out.println("The " + noun1 + " was sure to go.");
    }
}