public class Attorney
{
    private int ID;
    private String firstname, lastname;
    private double salary;
    public void setID(int number)
    {
	ID = number;
    }
    public void setFirstName(String name)
    {
	firstname = name;
    }
    public void setLastName(String name)
    {
	lastname = name;
    }
    public void setSalary(double number)
    {
	salary = number;
    }
    public int getID()
    {
	return ID;
    }
    public String getFirstName()
    {
	return firstname;
    }
    public String getLastName()
    {
	return lastname;
    }
    public double getSalary()
    {
	return salary;
    }
}