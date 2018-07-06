package spring.exercise01;

public class Dog implements AnimalType{
	private String myName;
	
	public void sound() {
		System.out.println("Dog Name="+myName+": "+"Bow Wow");
		
	}
	
	public void setMyName(String myName) {
		this.myName =myName;
	}
}
