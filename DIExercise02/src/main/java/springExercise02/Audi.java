package springExercise02;

public class Audi implements CarMaker{
	private Car car;
	
	public Audi() {}
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public Car sell() {
		this.car.setName("Audi A6");
		return car;
	}

}
