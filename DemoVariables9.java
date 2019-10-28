import javax.swing.JOptionPane;
public class DemoVariables9
{
    public static void main(String[] args)
    {
	int lotCapacity = 210;
	int avgPassengersPerCar = 3;
	double feePerHourPerCar = 1.25;
	double ticketPrice = 7.25;
	char parkingLot = 'B';
	double hoursForGame = 3.5;
	int totalPeople;
	double totalParking, totalTickets, grandTotal;
	totalParking = lotCapacity * feePerHourPerCar * hoursForGame;
	totalPeople = lotCapacity * avgPassengersPerCar;
	totalTickets = totalPeople * ticketPrice;
	grandTotal = totalParking + totalTickets;
	JOptionPane.showMessageDialog(null, "Parking Lot " + parkingLot + " projected income: \n" + lotCapacity + " cars at $" + feePerHourPerCar + " for " + hoursForGame + "hours\n....................$" + totalParking + "\n" + totalPeople + " fans at $" + ticketPrice + " each\n....................$" + totalTickets + "\n\nTotal expected\nrevenue from lot " + parkingLot + " is..........$" + grandTotal);
	System.exit(0);
    }
}