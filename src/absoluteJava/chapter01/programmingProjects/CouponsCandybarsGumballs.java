package absoluteJava.chapter01.programmingProjects;

public class CouponsCandybarsGumballs {
	public static final int NR_OF_COUPONS_PER_CANDY_BAR = 10;
	public static final int NR_OF_COUPONS_PER_GUMBALL = 3;
	
	private static int nrOfCoupons;
	private static int nrOfCandyBars;
	private static int nrOfGumballs;
	
	public static void main(String[] args){
		nrOfCoupons = 178;
		
		System.out.println("Setting the number of coupons to " + nrOfCoupons);
		
		nrOfCandyBars = nrOfCoupons / NR_OF_COUPONS_PER_CANDY_BAR;
		
		int couponsLeft = nrOfCoupons % NR_OF_COUPONS_PER_CANDY_BAR;
		
		nrOfGumballs = couponsLeft / NR_OF_COUPONS_PER_GUMBALL;
		
		int nrOfRemainCoupons = couponsLeft % NR_OF_COUPONS_PER_GUMBALL;
		
		System.out.println("This would get you " + nrOfCandyBars + " Candy Bar(s)");
		System.out.println("and " + nrOfGumballs + " Gumball(s).");
		System.out.println("You would have " + nrOfRemainCoupons + " remaining coupon(s).");
		
	}
}
