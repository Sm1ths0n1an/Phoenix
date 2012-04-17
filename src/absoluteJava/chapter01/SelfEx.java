package absoluteJava.chapter01;

public class SelfEx {
	private static double x;
	private static double y;
	private static double z;
	
	public static final int ANSWER = 42;
	
	public static void ex17(double x, double y, double z){
		System.out.println("Ex. 17");
		
		double a = 3 * x;
		double b = 3 * x + y;
		double c = (x + y) / 7;
		double d = (3 * x + y) / (z + 2);
		
		System.out.println("3x is equal to " + a);
		System.out.println("3x + y is equal to " + b);
		System.out.println("x + y divided by 7 is equal to " + c);
		System.out.println("3x + y divided by z + 2 is equal to " + d);
	}
	
	public static void ex18(){
		System.out.println("Ex. 18");
		
		double number = (1/3) * 3;
		System.out.println("(1 / 3) * 3 is equal to " + number);
	}
	
	public static void ex19(){
		System.out.println("Ex. 19");
		
		int quotient, remainder;
		quotient = 7 / 3;
		remainder = 7 % 3;
		System.out.println("quotient = " + quotient);
		System.out.println("remainder = " + remainder);
	}
	
	public static void ex20(){
		System.out.println("Ex. 20");
		
		int result = 11;
		result /= 2;
		System.out.println("result is " + result);
	}
	
	public static void ex21(){
		System.out.println("Ex. 21");
		
		double celcius = 20;
		double fahrenheit;
		fahrenheit = (9./5) * celcius + 32.0;
		
		System.out.println("Temprature in fahrenheit is " + fahrenheit);
	}
	
	public static void ex22(){
		System.out.println("Ex. 22");
		
		int n = (int)3.9;
		System.out.println("n == " + n);
	}
	
	public static void ex23(){
		System.out.println("Ex. 23");
		
		int n = 3;
		n++;
		System.out.println("n == " + n);
		n--;
		System.out.println("n == " + n);
	}
	
	public static void ex24(){
		System.out.println("Ex. 24");
		
		String verbPhrase = " is money";
		System.out.println("Time" + verbPhrase);
	}
	
	public static void ex25(){
		System.out.println("Ex. 25 ");
		String test = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(test.length());
		System.out.println(test.charAt(1));
	}
	
	public static void ex26(){
		System.out.println("Ex. 26");
		
		String test = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(test.substring(3));
	}
	
	public static void ex27(){
		System.out.println("Ex. 27");
		
		System.out.println("abc\ndef");
	}
	
	public static void ex28(){
		System.out.println("Ex. 28");
		
		System.out.println("abc\\ndef");
	}
	
	public static void ex29(){
		System.out.println("Ex. 29");
		
		String test = "Hello Tony";
		test = test.toUpperCase();
		System.out.println(test);
	}
	
	public static void ex30(){
		System.out.println("Ex. 30");
		
		System.out.println("2 + 2 = " + (2 + 2));
		System.out.println("2 + 2 = " + 2 + 2);
	}
	
	public static void ex31(){
		System.out.println("Ex. 31");
		
		final class Person {
			int age;
			
			public Person(int age){
				this.age = age;
			}
			
			void increaseAge(int inc){
				age = age + inc;
			}
			
			int getAge(){
				return this.age;
			}
		}
		
		Person sam = new Person(22);
		int increment = 10;
		
		System.out.println("sam is now " + sam.getAge());
		
		sam.increaseAge(increment);
		
		System.out.println("incrementing sam's age by " + increment);
		System.out.println("sam is now " + sam.getAge());
	}
	
	public static void ex32(){
		System.out.println("Ex. 32");
		
		System.out.println("There are // comments for single line comment \n and there are /* */ comments for block comments");
	}
	
	public static void ex33(){
		System.out.println("Ex. 33");
		
		/**
		 * Code for Exercise/
		 */
		System.out.println("Hello");
		//System.out.println("Mr. or Ms. ");
		System.out.println("Student");
	}
	
	public static void ex34(){
		System.out.println("Ex. 34");
		
		System.out.println("The normal spelling convention for named constand is in capitals and underscores between words,\nso constant myFirstConstant would be: MY_FIRST_CONSTANT");
	}
	
	public static void ex35(){
		System.out.println("Ex. 35");
		
		System.out.println("public static final int ANSWER = 42;");
		System.out.println("So ANSWER is a named constant for " + ANSWER);
	}
	
	public static void part1(){
		x = 1;
		y = 2;
		z = 3;
		
		ex17(x, y, z);
		ex18();
		ex19();
		ex20();
		ex21();
	}
	
	public static void part2(){
		ex22();
		ex23();
	}
	
	public static void part3(){
		ex24();
		ex25();
		ex26();
		ex27();
		ex28();
		ex29();
		ex30();
		ex31();
	}
	
	public static void part4(){
		ex32();
		ex33();
		ex34();
		ex35();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		part1();
		part2();
		part3();
		part4();
	}

}
