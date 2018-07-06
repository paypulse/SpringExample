package spring.exercise01;

public class Cat implements AnimalType {
	private String myName;
	
	public void sound() {
		System.out.println("Cat Name=" + myName +": " +"Meow!");
	}
	
	public void setMyName(String myName) {
		this.myName = myName;
	}
}

