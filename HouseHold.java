public class HouseHold
{
    public int occupants;
    public double income;
    public void setOccupants(int number)
    {
	this.occupants = number;
    }
    public void setIncome(double number)
    {
	this.income = number;
    }
    public int getOccupants()
    {
	return occupants;
    }
    public double getIncome()
    {
	return income;
    }
    public void Construct()
    {
	this.occupants = 1;
	this.income = 0;
    }
    public void House(int occupants, double income)
    {
	this.occupants = occupants;
	this.income = income;
    }
}