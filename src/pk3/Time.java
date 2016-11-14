package pk3;
import java.util.Calendar;

/*
 * Fredrik Larsson
 */


public class Time {
	private int hour;
	private int minute;
	private int second;
	 

	public Time() {
		Calendar cal = Calendar.getInstance();
        this.minute = cal.get(Calendar.MINUTE);
		this.hour = cal.get(Calendar.HOUR_OF_DAY);
		this.second = cal.get(Calendar.SECOND);
		}
	
	public int getHour(){
		  return this.hour;
		  }
	public int getMinute(){
		  return this.minute;
		  }
	public int getSecond(){
		  return this.second;
		  }
	
	public void update() {
        //Uppdaterar den nya tiden.
		Calendar cal = Calendar.getInstance();
        this.minute = cal.get(Calendar.MINUTE);
		this.hour = cal.get(Calendar.HOUR_OF_DAY);
		this.second = cal.get(Calendar.SECOND);
		}
		
    
	
	public String toString(){
	    return this.hour +":" + this.minute +":"+ this.second ; 
		
	}
}
