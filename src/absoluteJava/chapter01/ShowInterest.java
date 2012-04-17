package absoluteJava.chapter01;

public class ShowInterest {
	
	public static final double INTEREST_RATE = 2.5;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance = 100;
		double interest; //as a percentage
		
		interest = balance * (INTEREST_RATE/100.0);
		System.out.println("On a balance of $" + balance);
		System.out.println("you will earn interest of $" + interest);
		
		System.out.println("All in just on short year.");
	}

}
