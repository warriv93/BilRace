package p2;

import java.util.*;

public class Time {
	Calendar cal = Calendar.getInstance();
	private int hour, min, sec;
	            
	
	public Time(int hour, int min, int sec){
		
		
		this.hour = hour;
		this.min = min;
		this.sec = sec; 
		
	}
	
	public Time() {
		hour = cal.get(Calendar.HOUR_OF_DAY);
		min = cal.get(Calendar.MINUTE);
		sec = cal.get(Calendar.SECOND);
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return min;

	}
	public int getSecond(){
		return sec;
	}
	public void update(){
		cal.setTime(new Date());
	}
	
	public String toString(){
		return hour+":"+min+":"+sec;
	}
	
	
	
	
	
	
	
	
}
	
	