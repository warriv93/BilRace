package p2;

import java.util.*;

public class Time {
	//gör det möjligt att hämta värdena från calendar
	private Calendar cal = Calendar.getInstance();
	private int hour, min, sec;
	            
	

	
	public Time() {
		//importerar hour, min, sec
		this.hour = cal.get(Calendar.HOUR_OF_DAY);
		this.min = cal.get(Calendar.MINUTE);
		this.sec = cal.get(Calendar.SECOND);
	}
	
	public int getHour(){
		//gör det möjligt att hämta hour från calendar.
		return hour;
	}
	
	public int getMinute(){
		//gör det möjligt att hämta min från calendar.
		return min;

	}
	public int getSecond(){
		//gör det möjligt att hämta sec från calendar.
		return sec;
	}
	public void update(){
		// calendar blir importerat igen och värdena på det nya sec, min, hour hämtas.
		Calendar cal = Calendar.getInstance();
		this.sec = cal.get(Calendar.SECOND);
		this.min = cal.get(Calendar.MINUTE);
		this.hour = cal.get(Calendar.HOUR_OF_DAY);
//		cal.getTime();
//		
//		cal.set(0, 0, 0, hour, min, sec);
//		cal.setTime(new Date());
		
		
		
	}
	
	public String toString(){
		//skriv ut hour, min och sec i console.
		return hour+":"+min+":"+sec;
	}
	
	
	
	
	
	
	
	
}
	
	