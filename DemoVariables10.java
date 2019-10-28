import javax.swing.JOptionPane;
public class DemoVariables10
{
    public static void main(String[] args)
    {
        int lotCapacity = 210;
        int avgPassengersPerCar;
        double feePerHourPerCar;
        double ticketPrice = 7.25;
        char parkingLot = 'B';
        double hoursForGame = 3.5;
        int totalPeople;
        double totalParking, totalTickets, grandTotal;
	avgPassengersPerCar = Integer.parseInt(JOptionPane.showInputDialog (null, "What is the average number of passengers per car?"));
	feePerHourPerCar = Double.parseDouble(JOptionPane.showInputDialog (null, "What is the fee per hour per car?"));
        totalParking = lotCapacity * feePerHourPerCar * hoursForGame;
        totalPeople = lotCapacity * avgPassengersPerCar;
        totalTickets = totalPeople * ticketPrice;
        grandTotal = totalParking + totalTickets;
        JOptionPane.showMessageDialog(null, "Parking Lot " + parkingLot + " projected income: \n" + lotCapacity + " cars at $" + feePerHourPerCar + " for " + hoursForGame + "hours\n....................$" + totalParking + "\n" + totalPeople + " fans at $" + ticketPrice + " each\n....................$" + totalTickets + "\n\nTotal expected\nrevenue from lot " + parkingLot + " is..........$" + grandTotal);
        System.exit(0);
    }
}