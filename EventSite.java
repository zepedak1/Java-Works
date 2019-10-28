public class EventSite
{
    static final public String HEADQUARTERS = "Crystal Lake, IL";
    private int siteNumber;
    private double usageFee;
    private String managerName;
    public EventSite()
    {
	siteNumber = 999;
	managerName = "ZZZ";
    }
    public EventSite(int siteNum)
    {
	siteNumber = siteNum;
	managerName = "zzz";
    }
    public EventSite(String managerName)
    {
	this.managerName = managerName;
    }
    public EventSite(String managerName, int siteNum)
    {
	this.managerName = managerName;
	this.siteNumber = siteNum;
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
