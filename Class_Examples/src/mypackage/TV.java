package mypackage;

public class TV {	//was "chp8_classnotes"
	
	public int size;
	public String color;
	public boolean on;
	public int volume;
	
	public TV(){
		
	}
	
	public TV(int s, String c, boolean b, int v){
		
		size = s;
		color = c;
		on = b;
		volume = v;
	}
	
	public void turnOn(){
		on = true;
	}
	
	public void turnOff(){
		on = false;
	}
	
	public static void main (String[]args){
		System.out.println("Hi");	//testing github
	}
	
}
