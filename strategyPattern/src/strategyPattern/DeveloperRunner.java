package strategyPattern;

public class DeveloperRunner {
	public static void main(String[] args) {
		Developer developer = new Developer();
	
		developer.setActivity(new Sleeping());
		developer.executeActivity();
		System.out.println();
		developer.setActivity(new Coding());
		developer.executeActivity();
		System.out.println();
		developer.setActivity(new Training());
		developer.executeActivity();
		System.out.println();
		developer.setActivity(new Reading());
		developer.executeActivity();
	}
}
