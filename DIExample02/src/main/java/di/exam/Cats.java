package di.exam;

public class Cats {
	private MyCats myCats;
	
	public Cats(MyCats myCats) {
		this.myCats = myCats;
	}
	
	public void getMyCatsInfo() {
		System.out.println("============================");
		System.out.println("야옹이 이름 :"+myCats.getName());
		System.out.println("야옹이 나이 :"+myCats.getAge());
		System.out.println("야옹이 취미 :"+myCats.getHobbys() );
		
	}

}
