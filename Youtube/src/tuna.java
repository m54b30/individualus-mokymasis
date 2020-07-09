
public class tuna {

//public enum tuna {

//	public void simpleMessage() {
//		System.out.println("This is another class");
//	}
//	
//	public void simpleMessage(String name) {
//		System.out.println("Hello " + name);
//	}
//	
//	private String girlName;
//	
//	public tuna(String name) {
//		girlName = name;
//	}
//
//	public void setName(String name) {
//		girlName = name;
//	}
//	
//	public String getName(){
//		return girlName;
//	}
//	
//	public void saying() {
//		System.out.printf("Your first girlfriend was %s", getName());
//	}
	
//	private int hour;
//	private int minute;
//	private int second;
//	public void setTime(int h, int m, int s) {
//		hour = ((h >= 0 && h < 24) ? h : 0);
//		minute = ((m >= 0 && m < 60) ? m : 0);
//		second = ((s >= 0 && s < 60) ? s : 0);
//	}
//	public String toMilitary() {
//		return String.format("%02d:%02d:%02d", hour,minute,second);
//	}
//	public String toString(){
//		return String.format("%d:%02d:%02d %s", ((hour==0 || hour ==12)? 12:hour%12), minute,second,(hour < 12? "AM":"PM"));
//	}
	
	
//	private int hour;
//	private int minute;
//	private int second;
//	public tuna() {
//		this(0,0,0);
//	}
//	public tuna(int h) {
//		this(h,0,0);
//	}
//	public tuna(int h, int m) {
//		this(h,m,0);
//	}
//	public tuna(int h, int m, int s) {
//		setTime(h,m,s);
//	}
//	public void setTime(int h, int m, int s) {
//		setHour(h);
//		setMinute(m);
//		setSecond(s);
//	}
//	public void setHour(int h) {
//		hour = ((h >= 0 && h < 24) ? h : 0);
//	}
//	public void setMinute(int m) {
//		minute = ((m >= 0 && m < 60) ? m : 0);
//	}
//	public void setSecond(int s) {
//		second = ((s >= 0 && s < 60) ? s : 0);
//	}
//	public int getHour() {
//		return hour;
//	}
//	public int getMinute() {
//		return minute;
//	}
//	public int getSecond() {
//		return second;
//	}
//	public String toMilitary() {
//		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
//	}
	
//	private String name;
//	private potpie birthday;
//	public tuna(String theName, potpie theDate) {
//		name = theName;
//		birthday = theDate;
//	}
//	public String toString() {
//		return String.format("My name is %s, my birthday is %s", name, birthday);
//	}
	
	
//	enum
//	bucky("nice", "22"),
//	kelsey("cutie", "10"),
//	julia("bigmistake", "12"),
//	nicole("italian", "13"),
//	candy("different", "14"),
//	erin("iwish", "16");
//	
//	private final String desc;
//	private final String year;
//	
//	tuna (String description, String birthday){
//		desc = description;
//		year = birthday;
//	}
//	public String getDesc() {
//		return desc;
//	}
//	public String getYear() {
//		return year;
//	}
	
	
//	private String first;
//	private String last;
//	private static int members = 0;
//	
//	public tuna(String fn, String ln) {
//		first = fn;
//		last = ln;
//		members++;
//		System.out.printf("Constructor for %s %s, members in the club : %d\n", first, last, members);
//	}
//	public String getFirst() {
//		return first;
//	}
//	public String getLast() {
//		return last;
//	}
//	public static int getMembers() {
//		return members;
//	}
	
	private int sum;
	private final int NUMBER;
	
	public tuna(int x) {
		NUMBER = x;
	}
	
	public void add() {
		sum+=NUMBER;
	}
	public String toString() {
		return String.format("sum = %d\n", sum);
	}
}
