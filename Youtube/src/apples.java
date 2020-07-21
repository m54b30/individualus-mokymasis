import java.util.Scanner;
import java.util.EnumSet;
import java.util.Random;

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
	
//	public static void main(String[] args) {
//		tuna tunaObject = new tuna();
//		tunaObject.simpleMessage();
//	}
	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		tuna tunaObject = new tuna();
//		
//		System.out.println("Enter your name here: ");
//		String name = input.nextLine();
//	
//		tunaObject.simpleMessage(name);
//	}
	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		tuna tunaObject = new tuna();
//		
//		System.out.println("Enter name of first girlfriend here:");
//		String temp = input.nextLine();
//		tunaObject.setName(temp);
//		tunaObject.saying();
//	}
	
//	public static void main(String[] args) {
//		tuna tunaObject = new tuna("Ariana");
//		tuna tunaObject2 = new tuna("Halsey");
//		tunaObject.saying();
//		tunaObject2.saying();
//	}
	
//	public static void main(String[] args) {
//		int age = 60;
//		
//		if (age < 50) {
//			System.out.println("You are young");
//		}else{
//			System.out.println("You are old");
//			if(age > 75) {
//				System.out.println("You are really old");
//			}else {
//				System.out.println("Dont worry you arent really that old");
//			}
//		}
//	}
	
//	public static void main(String[] args) {
//		int age = 45;
//		
//		if(age >= 60) 
//			System.out.println("You are senior citizen");
//		else if( age >= 50)
//			System.out.println("You are in your 50s");
//		else if( age >= 40)
//			System.out.println("You are in your 40s");
//		else
//			System.out.println("You are young");
//	}
	
//	public static void main(String[] args) {
//		int age = 21;
//		
//		System.out.println(age > 50 ? "You are old" : "You are young");
//
//	}
	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int total = 0;
//		int grade;
//		int average;
//		int counter = 0;
//		
//		while(counter < 10){
//			grade = input.nextInt();
//			total = total + grade;
//			counter++;
//		}
//		average = total/10;
//		System.out.println("Your average is " + average);
//	}
	
//	public static void main(String[] args) {
//		for(int counter = 0; counter <= 30; counter+=3) {
//			System.out.println(counter);
//		}
//	}
	
//	public static void main(String[] args) {
//		double amount;
//		double principal = 10000;
//		double rate = .01;
//		
//		for(int day = 1; day<=20; day++) {
//			amount = principal*Math.pow(1 + rate, day);
//			System.out.println(day + "  " + amount);
//		}
//	}
	
//	public static void main(String[] args) {
//		int counter = 0;
//		
//		do{
//			System.out.println(counter);
//			counter++;
//		}while(counter <=10);
//	}
	
//	public static void main(String[] args) {
//		System.out.println(Math.sqrt(9));
//	}
	
//	public static void main(String[] args) {
//		Random dice = new Random();
//		int number;
//		
//		for(int counter = 1; counter<=10; counter++) {
//			number = 1 + dice.nextInt(6);
//			System.out.println(number + " ");
//		}
//	}
	
//	public static void main(String[] args) {
//	
//		int bucky[] = {2,5,6,10,8,9,11,123};
//		
//		System.out.println(bucky[5]);
//	}
	
//	public static void main(String[] args) {
//		
//		System.out.println("Index\tValue");
//		int bucky[] = {22,33,44,55,123,456,789};
//		
//		for(int counter = 0; counter < bucky.length; counter++) {
//			System.out.println(counter + "\t" + bucky[counter]);
//		}
//	}
	
//	public static void main(String[] args) {
//		int bucky[] = {21,45,56,89,45};
//		int sum = 0;
//		
//		for(int counter = 0; counter < bucky.length; counter++) {
//			sum+=bucky[counter];
//		}
//		System.out.println("The sum of these number is " + sum);
//	}
	
//	public static void main(String[] args) {
//		Random rand = new Random();
//		int freq[] = new int[7];
//		
//		for(int roll = 1; roll < 1000; roll++) {
//			++freq[1 + rand.nextInt(6)];
//		}
//		System.out.println("Face\tFrequency");
//		
//		for(int face = 1; face < freq.length; face++) {
//			System.out.println(face+"\t"+freq[face]);
//		}
//	}
	
//	public static void main(String[] args) {
//		int bucky[] = {1,2,3,4,5,6,7,8,9};
//		int total = 0;
//		
//		for(int x: bucky) {
//			total+=x;
//		}
//		System.out.println(total);	
//	}
	
//	public static void main(String[] args) {
//		int bucky[] = {1,2,3,4,5,6,7,8,9};
//		change(bucky);
//
//		for(int y:bucky)
//			System.out.println(y);
//	}
//	public static void change(int x[] ) {
//		for(int counter = 0; counter < x.length; counter++) {
//			x[counter]+=5;
//		}
//	}
	
//	public static void main(String[] args) {
//		int firstArray[][] = {{8,9,10,11,12},{13,14,15,16,17}};
//		int secondArray[][] = {{30,20,5,456,42,2},{12,13,14,15,16,17},{56},{45,69,95}};
//		System.out.println("FirstArray");
//		display(firstArray);
//		System.out.println("SecondArray");
//		display(secondArray);
//	}
//	public static void display(int x[][]) {
//		for(int row = 0; row < x.length; row++) {
//			for(int column = 0; column < x[row].length; column++) {
//				System.out.print(x[row][column]+"\t");
//			}
//			System.out.println();
//		}
//	}
	
	
//	public static void main(String[] args) {
//		System.out.print(average(1,2,3,4,5,6,7,8,9));
//	}
//	public static int average(int...numbers) {
//		int total = 0;
//		for(int x:numbers)
//			total+= x;
//		
//		return total/numbers.length;
//	}
	
//	public static void main(String[] args) {
//		tuna tunaObject = new tuna();
//		System.out.println(tunaObject.toMilitary());
//		System.out.println(tunaObject.toString());
//
//		tunaObject.setTime(13, 24, 9);
//		System.out.println(tunaObject.toMilitary());
//		System.out.println(tunaObject.toString());
//		
//		
//	}
	
//	public static void main(String[] args) {
//		tuna tunaObject = new tuna();
//		tuna tunaObject2 = new tuna(5);
//		tuna tunaObject3 = new tuna(5,13);
//		tuna tunaObject4 = new tuna(5,11,11);
//		
//		System.out.printf("%s\n", tunaObject.toMilitary());
//		System.out.printf("%s\n", tunaObject2.toMilitary());
//		System.out.printf("%s\n", tunaObject3.toMilitary());
//		System.out.printf("%s\n", tunaObject4.toMilitary());	
//	}
	
//	public static void main(String[] args) {
//		potpie potObject = new potpie(4,5,6);
//		tuna tunaObject = new tuna("Bucky", potObject);
//		
//		System.out.println(tunaObject);
//	}
	
//	public static void main(String[] args) {
//		for(tuna people: tuna.values()) {
//			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
//		}
//			System.out.println("\nAnd Now for the range constants!!!\n");
//			
//		for(tuna people: EnumSet.range(tuna.kelsey, tuna.candy)) {
//			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear()); 
//		}
//	}
	
//	public static void main(String[] args) {
//		tuna member1 = new tuna("Megan", "Fox");
//		tuna member2 = new tuna("Ariana", "Grande");
//		tuna member3 = new tuna("Taylor", "Swift");
//		
//		System.out.println(tuna.getMembers());
//	}
	
//	public static void main(String[] args) {
//		tuna tunaObject = new tuna(10);
//		
//		for(int i = 0; i < 5; i++) {
//			tunaObject.add();
//			System.out.printf("%s", tunaObject);
//			
//		}
//	}
	
//	public static void main(String[] args) {
//		Random rand = new Random();
//		double freq[] = new double[7];
//		final double rollCount =  1000;
//		
//		for(int roll = 0; roll < rollCount; roll++) {
//			++freq[1 + rand.nextInt(6)];
//		}
//		System.out.println("Face\tFrequency");
//		
//		for(int face = 1; face < freq.length; face++) {
//			System.out.println(face+"\t"+freq[face]*100/rollCount +"%");
//		}
//	}
	
	
//	Uzduotis nr1
	
//	public static void main(String[] args) {
//		233168
//		final int limit = 99999;
//		int sum = sumOf(3, limit) +sumOf(5, limit) -sumOf(15, limit);
//		System.out.println(sum);
//		
//	}
//	public static int sumOf(int d, int ceil) {
//		int n = ceil / d;
//		return n*d*(1+n)/2;
//	}
	
//	Uzduotis nr2
	
	public static void main(String[] args) {
		
		final int limit = 4000000;
		int number1 = 0;
		int number2 = 1;
		int sum = 0;
		int evenSum = 0;
		
		while(sum < limit) {
			sum = number1 + number2;
			number1 = number2;
			number2 = sum;
			if(sum%2==0) {
				evenSum = evenSum + sum;
			}
		}
		System.out.println(evenSum);
		
		for(int number3 = 3; number3 < limit;) {
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
			if(number3 % 2 == 0) {
				sum+= number2;
				System.out.println(sum);
			}
		}
	}	
}
