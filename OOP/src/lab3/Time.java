package lab3;
//#5
public class Time implements Comparable<Time>{
	private int hour;
	private int minute;
	private int second;
	
	Time(){
		this(0,0,0);
	}
	
	Time(int h){
		this(h,0,0);
	}
	
	Time(int h, int m){
		this(h,m,0);
	}
	
	Time(int h, int m, int s){
		setTime(h,m,s);
	}
	
	void setTime(int h, int m, int s) {
		if(h<0 || h>23) throw new IllegalArgumentException("Hours must be in range \"0-23\"");
		if(m<0 || m>59) throw new IllegalArgumentException("Minutes must be in range \"0-59\"");
		if(s<0 || s>59) throw new IllegalArgumentException("Seconds must be in range \"0-59\"");
		
		hour = h;
		minute = m;
		second = s;
	}
	
	@Override
	public String toString() {
		return toUniversal();
	}
	
	String toUniversal(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	String toStandard() {
		if(hour>12) return String.format("%02d:%02d:%02d PM", hour-12, minute, second);
		if(hour==0) return String.format("12:%02d:%02d AM", minute, second);
		if(hour==12)return String.format("12:%02d:%02d PM",  minute, second);
		return String.format("%02d:%02d:%02d AM", hour, minute, second);
	}
	
	private static int[] normalize(int sum) {
		int[] info = new int[2];
		info[0] = sum /60; //integer part
		info[1] = sum %60; //remainder
		return info;
	}
	
	static Time add(Time t1, Time t2) {
		int totalSec = t1.second+t2.second;
		int[] secInfo = normalize(totalSec);
		
		int totalMin = t1.minute+t2.minute+secInfo[0];
		int[] minInfo = normalize(totalMin);
		
		int totalHours = (t1.hour+t2.hour+minInfo[0])%24;
		
		return new Time(totalHours, minInfo[1], secInfo[1]);
	}
	
	Time add(Time t2) {
		return(add(this, t2));
	}
	
	@Override
	public int compareTo(Time t) {
		int compare = Integer.compare(this.hour, t.hour);
		if(compare!=0) return compare;
		compare = Integer.compare(this.minute, t.minute);
		if(compare!=0) return compare;
		return Integer.compare(this.second, t.second);
	}
}
