import javax.swing.JOptionPane;
public class ChooseManager
{
    public static void main(String[] args)
    {
	String choiceString, chosenManager;
	int eventType;
	final String PRIV_MANAGER = "Dustin Britt";
	final String CORP_MANAGER = "Carmen Lindsey";
	choiceString = JOptionPane.showInputDialog(null, "What type of event are you scheduling?" + "\nEnter 1 for Private, 2 for Corporate");
	eventType= Integer.parseInt(choiceString);
	if(eventType == 1)
	    chosenManager = PRIV_MANAGER;
	else
	    chosenManager = CORP_MANAGER;
	JOptionPane.showMessageDialog(null, "Manager for this event will be " + chosenManager);
	System.exit(0);
    }
}