
public class Sparrow extends Bird implements Flyable{

	public Sparrow(int age, String gender, int weightInKg) {
		super(age, gender, weightInKg);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Sparrow flying high");
	}

}
