public class Meeting
{
    private String day, starttime, endtime;
    public void setDay(String ting)
    {
	day = ting;
    }
    public void setStartTime(String time)
    {
	starttime = time;
    }
    public void setEndTime(String time)
    {
	endtime = time;
    }
    public String getDay()
    {
	return day;
    }
    public String getStartTime()
    {
	return starttime;
    }
    public String getEndTime()
    {
	return endtime;
    }
}