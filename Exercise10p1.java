import java.sql.Time;
import ToolKit.Time;

public class Exercise10p1 {
	
	public class Time
	{
		private int hours;
		private int minutes;
		private int seconds;
	}
	
	public Time()
	{
		long currentTime = System.currentTimeMillis();
		currentTime += 3600000*5;
		currentTime+= 60000*30;
		setTime(currentTime);
	}
	
	
	public static void main(String[] args) {
		// Create two Time objects
		Time time1 = new Time();
		Time time2 = new Time(555550000);

		// Display Time objects hour, minute, and 
		// second in the format hour:minute:second 
		System.out.println(time1.getHour() + ":" + time1.getMinute() + 
			":" + time1. getSecond());
		System.out.println(time2.getHour() + ":" + time2.getMinute() + 
			":" + time2. getSecond());
	}
}