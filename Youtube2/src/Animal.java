
public abstract class Animal {
	int age;
	String gender;
	int weigthInKg;
	
	public Animal(int age, String gender, int weightInKg) {
		this.age = age;
		this.gender = gender;
		this.weigthInKg = weightInKg;
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	
	public void sleep() {
		System.out.println("sleeping...");
	}
	
	public abstract void move();
}

