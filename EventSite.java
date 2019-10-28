public class EventSite
{
    private int siteNumber;
    private double usageFee;
    private String managerName;
    public EventSite()
    {
	siteNumber = 999;
	managerName = "zzz";
    }
    public double getFee()
    {
	return usageFee;
    }
    public String getManager()
    {
	return managerName;
    }
    public int getSiteNumber()
    {
	return siteNumber;
    }
    public void setFee(double fee)
    {
	usageFee = fee;
    }
    public void setManager(String manager)
    {
	managerName = manager;
    }
    public void setSiteNumber(int n)
    {
	siteNumber = n;
    }
}
