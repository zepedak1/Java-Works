public class RoomSchedule
{
    public static void main(String[] args)
    {
	Meeting meeting1 = new Meeting();
	Meeting meeting2 = new Meeting();
	String day, starttime, endtime;
	meeting1.setDay("Tuesday");
	meeting2.setDay("Wendsday");
	meeting1.setStartTime("10:00am");
	meeting2.setStartTime("11:30am");
	meeting1.setEndTime("12:00pm");
	meeting2.setEndTime("12:00pm");
	day = meeting1.getDay();
	starttime = meeting1.getStartTime();
	endtime = meeting1.getEndTime();
	System.out.println("Meeting 1 will be on " + day + " from " + starttime + " to " + endtime);
	day = meeting2.getDay();
	starttime = meeting2.getStartTime();
	endtime = meeting2.getEndTime();
	System.out.println("Meeting 2 will be on " + day + " from " + starttime+ " to " + endtime);
    }
}
	