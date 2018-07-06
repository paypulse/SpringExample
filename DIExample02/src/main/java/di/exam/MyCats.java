package di.exam;

import java.util.ArrayList;

public class MyCats {
	private String name;
	private int age;
	private ArrayList<String> hobbys;
	
	public MyCats(String name, int age, ArrayList<String> hobbys) {
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public ArrayList<String> getHobbys(){
		return hobbys;
	}
	
}
