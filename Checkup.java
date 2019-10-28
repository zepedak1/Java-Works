public class Checkup
{
    private int patient;
    private double systolic, diastolic;
    private double LDL, HDL;
    public void setPatient(int number)
    {
	patient = number;
    }
    public void setSystolic(double number)
    {
	systolic = number;
    }
    public void setDiastolic(double number)
    {
	diastolic = number;
    }
    public void setLDL(double number)
    {
	LDL = number;
    }
    public void setHDL(double number)
    {
	HDL = number;
    }
    public int getPatient()
    {
	return patient;
    }
    public double getSystolic()
    {
	return systolic;
    }
    public double getDiastolic()
    {
	return diastolic;
    }
    public double getLDL()
    {
	return LDL;
    }
    public double getHDL()
    {
	return HDL;
    }
    public void computeRatio()
    {
	double number;
	number = LDL / HDL;
	System.out.println("The ratio of LDL to HDL is: " + number);
    }
    public void ExplainRatio()
    {
	System.out.println("HDL is known as good cholesteral");
	System.out.println("A ratio of 3.5 or lower is considered optimum");
    }
}