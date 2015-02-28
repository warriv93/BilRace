package p2;

import java.util.*;

public class Time {
	//g�r det m�jligt att h�mta v�rdena fr�n calendar
	private Calendar cal = Calendar.getInstance();
	private int hour, min, sec;
	            
	

	
	public Time() {
		//importerar hour, min, sec
		this.hour = cal.get(Calendar.HOUR_OF_DAY);
		this.min = cal.get(Calendar.MINUTE);
		this.sec = cal.get(Calendar.SECOND);
	}
	
	public int getHour(){
		//g�r det m�jligt att h�mta hour fr�n calendar.
		return hour;
	}
	
	public int getMinute(){
		//g�r det m�jligt att h�mta min fr�n calendar.
		return min;

	}
	public int getSecond(){
		//g�r det m�jligt att h�mta sec fr�n calendar.
		return sec;
	}
	public void update(){
		// calendar blir importerat igen och v�rdena p� det nya sec, min, hour h�mtas.
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
	
	