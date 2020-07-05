import java.util.Scanner;

class apples{
	
//	public static void main(String args[]) {
//		System.out.println("Labas");
//	}
	
//	public static void main(String args[]) {
//		double tuna;
//		tuna = 5.28;
//		
//		System.out.print("I Want ");
//		System.out.print(tuna);
//		System.out.println(" movies");
//	}
	
//	public static void main(String args[]) {
//		Scanner bucky = new Scanner(System.in);
//		System.out.println(bucky.nextLine());
//	}
	
//	public static void main(String args[]) {
//		Scanner bucky = new Scanner(System.in);
//		double fnum, snum, answer;
//		System.out.println("Enter first num: ");
//		fnum = bucky.nextDouble();
//		System.out.println("Enter second number: ");
//		snum  = bucky.nextDouble();
//		answer = fnum + snum;
//		System.out.println(answer);
//	}
	
//	public static void main(String args[]) {
//		Scanner bucky = new Scanner(System.in);
//		
//		int girls, boys, people;
//		girls = 7;
//		boys = 3;
//		people = girls % boys;
//		System.out.println(people);
//	}
	
//	public static void main(String args[]) {
//		Scanner bucky = new Scanner(System.in);
//		
//		int tuna = 5;
//		int bass = 18;
//		
//		tuna *= 8;
//		
//		System.out.println(tuna);
//	}
	
//	public static void main(String args[]) {
//		String name = "Ugnius";
//		
//		if(name.equals("Ugnius")) {
//			System.out.println("Sveikas");
//		}else {
//			System.out.println("Išeik");
//		}
//	}
	
//	public static void main(String args[]) {
//		int boy, girl;
//		boy = 18;
//		girl = 29;
//		
//		if (boy > 10 && girl < 60) {
//			System.out.println("You can enter");
//		}else {
//			System.out.println("You can not enter");
//		}
//	}
	
//	public static void main(String args[]) {
//		int age;
//		age = 3;
//		
//		switch (age) {
//			case 1:
//				System.out.println("You can crawl");
//				break;
//			case 2:
//				System.out.println("You can talk");
//				break;
//			case 3:
//				System.out.println("You can get in trouble");
//				break;
//			default:
//				System.out.println("I dont know how old you are");
//				break;
//		}
//	}
	
//	public static void main(String args[]) {
//		int counter = 0;
//		
//		while (counter <= 10) {
//			System.out.println(counter);
//			counter ++;
//		}
//	}
	
//	public static void main(String args[]) {
//		int counter = 0;
//		
//		while (counter <= 10) {
//			System.out.println(counter);
//			counter ++;
//		}
//	}
	
//	public static void main(String args[]) {
//		tuna tunaObject = new tuna();
//		tunaObject.simpleMessage();
//	}
	
//	public static void main(String args[]) {
//		Scanner input = new Scanner(System.in);
//		tuna tunaObject = new tuna();
//		
//		System.out.println("Enter your name here: ");
//		String name = input.nextLine();
//	
//		tunaObject.simpleMessage(name);
//	}
	
//	public static void main(String args[]) {
//		Scanner input = new Scanner(System.in);
//		tuna tunaObject = new tuna();
//		
//		System.out.println("Enter name of first girlfriend here:");
//		String temp = input.nextLine();
//		tunaObject.setName(temp);
//		tunaObject.saying();
//	}
	
	public static void main(String args[]) {
		tuna tunaObject = new tuna("Ariana");
		tuna tunaObject2 = new tuna("Halsey");
		tunaObject.saying();
		tunaObject2.saying();
	}
}