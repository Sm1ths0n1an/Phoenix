package absoluteJava.chapter02;

public class SelfEx {
	
	public static void ex01(){
		System.out.println("Ex. 01");
		
		String s = "Hello" + "Joe";
		System.out.println(s);
	}
	
	public static void ex02(){
		System.out.println("Ex. 02");
		
		System.out.println("One two buckle your shoe.");
		System.out.println("Three four shut the door.");
	}
	
	public static void ex03(){
		System.out.println("Ex. 03");
		
		System.out.println("System.out.println() will print the next output on a new line,\nwhile System.out.print() will print the next output on the same line.");
	}
	
	public static void ex04(){
		System.out.println("Ex. 04");
		
		System.out.println(2 + " " + 2);
		System.out.println(2 + 2);
	}
	
	public static void part1(){
		ex01();
		ex02();
		ex03();
		ex04();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		part1();
	}

}
