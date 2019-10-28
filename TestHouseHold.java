public class TestHouseHold
{
    public static void main(String[] args)
    {
	HouseHold home1 = new HouseHold();
	home1.setOccupants(2);
	home1.setIncome(100000);
	System.out.println("Occupants: " + home1.getOccupants());
	System.out.println("Income: " + home1.getIncome());
	home1.Construct();
	System.out.println("Values after using constructor");
	System.out.println("Occupants: "  + home1.getOccupants());
	System.out.println("Income: " + home1.getIncome());
	home1.House(3, 200000);
	System.out.println("Values after using constructor that takes 2 input");
	System.out.println("Occupants: " + home1.getOccupants());
	System.out.println("Income: " + home1.getIncome());
    }
}