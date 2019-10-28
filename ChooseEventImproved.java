import javax.swing.JOptionPane;
public class ChooseEventImproved
{
    public static void main(String[] args)
    {
        String choiceString, chosenManager;
        int eventType;
        final String PRIV_MANAGER = "Dustin Britt";
        final String CORP_MANAGER = "Carmen Lindsey";
        final double PRIV_RATE = 47.99;
        final double CORP_RATE = 75.99;
        double rate;
        Event scheduledEvent = new Event();
        choiceString = JOptionPane.showInputDialog(null, "What type of event are you scheduling?" + "\nEnter 1 for Private, 2 for Corporate");
        eventType = Integer.parseInt(choiceString);
        if(eventType == 1)
            {
                chosenManager = PRIV_MANAGER;
                rate = PRIV_RATE;
            }
        else if(eventType == 2)
            {
                chosenManager = CORP_MANAGER;
                rate = CORP_RATE;
            }
	else
	    {
		eventType = 999;
		chosenManager = "Unassigned";
		rate = 0.0;
	    }
        scheduledEvent.setType(eventType);
        scheduledEvent.setManager(chosenManager);
        scheduledEvent.setRate(rate);
        JOptionPane.showMessageDialog(null, "Event type " + scheduledEvent.getType() + "\nManager for this event will be " + scheduledEvent.getManager() + "\nThe hourly fee will be $" + scheduledEvent.getRate());
        System.exit(0);
    }
}