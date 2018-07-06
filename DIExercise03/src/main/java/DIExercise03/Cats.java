package DIExercise03;

public class Cats {
	private String firstCatName;
	private int firstCatAge;
	private String secondCatName;
	private int secondCatAge;
	
	public void catsName() {
		System.out.println("catsName()");
		System.out.println("첫번째 고양이 이름은" + firstCatName+"입니다.");
		System.out.println("두번째 고양이 이름은" + secondCatName+"입니다.");
	}
	
	public void cataAge() {
		System.out.println("catsAge()");
		System.out.println("첫번째 고양이 이름은" + firstCatAge+"살 입니다.");
		System.out.println("두번째 고양이 이름은" + secondCatAge+"살 입니다.");
		
	}
	
	public void setFirstCatName(String firstCatName) {
		this.firstCatName = firstCatName;
		
		
	}
	
	public void catsName(String firstCatName,String secondCatName) {
		System.out.println("catsName()");
		System.out.println("첫번째 고양이 이름은 : "+ firstCatName +"입니다.");
		System.out.println("두번째 고양이 이름은 : "+ secondCatName+"입니다." );

	}
	
	public void catsAge(int firstCatAge, int secondCatAge) {
		System.out.println("catsAge()");
		System.out.println("첫번째 고양이 나이는"+ firstCatAge+"살 입니다.");
		System.out.println("두번째 고양이 나이는"+ secondCatAge+"살 입니다.");
		
		
	}
}
