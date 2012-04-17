package absoluteJava.chapter01.programmingProjects;

public class MetabolicEquivalents {
	public static final int RUNNING_IN_METS = 10;
	public static final int BASKETBALL_IN_METS = 8;
	public static final int SLEEPING_IN_METS = 1;
	public static final double POUND_TO_KG_DIVIDER = 2.2;
	public static final double CAL_PER_MIN_CONST = 0.0175;
	public static final double HOURS_TO_MIN = 60;
	
	private static int weightInPounds;
	private static double weightInKilograms;
	private static int minutesRunning;
	private static int minutesPlayingBasketball;
	private static int hoursSleeping;
	private static double calsPerMinRunning;
	private static double calsPerMinPlayingBasketball;
	private static double calsPerMinSleeping;
	private static double calsUsedRunning;
	private static double calsUsedPlayingBasketball;
	private static double calsUsedSleeping;
	private static double totalCalsUsed;
	
	public static double calculateCalsPerMin(int mets, double weight){
		return (CAL_PER_MIN_CONST * mets * weight);
	}
	
	public static void main(String[] args){
		weightInPounds = 150;
		
		System.out.println("Setting weight in pounds to " + weightInPounds);
		
		weightInKilograms = weightInPounds / POUND_TO_KG_DIVIDER;
		
		System.out.println("Thats is " + weightInKilograms + " kilograms.\n");
		
		minutesRunning = 30;
		minutesPlayingBasketball = 30;
		hoursSleeping = 6;
		
		System.out.println("Activities:\n" + minutesRunning + " minutes of running\n" + minutesPlayingBasketball + " minutes of playing basketball\n" + hoursSleeping + " hours sleeping\n" );
		
		calsPerMinRunning = calculateCalsPerMin(RUNNING_IN_METS, weightInKilograms);
		calsPerMinPlayingBasketball = calculateCalsPerMin(BASKETBALL_IN_METS, weightInKilograms);
		calsPerMinSleeping = calculateCalsPerMin(SLEEPING_IN_METS, weightInKilograms);
		
		System.out.println("The number of calories burned per minute for these activities:\n" + calsPerMinRunning + " Calories/Minute Running\n" + calsPerMinPlayingBasketball + " Calories/Minute Playing basketball\n" + calsPerMinSleeping + " Calories/Minute Sleeping\n");
		
		calsUsedRunning = calsPerMinRunning * minutesRunning;
		calsUsedPlayingBasketball = calsPerMinPlayingBasketball * minutesPlayingBasketball;
		calsUsedSleeping = calsPerMinSleeping * (hoursSleeping * HOURS_TO_MIN);
		
		totalCalsUsed = calsUsedRunning + calsUsedPlayingBasketball + calsUsedSleeping;
		
		System.out.println("The number of calories burned doing those activities:");
		System.out.println(minutesRunning + " minutes running = " + calsUsedRunning + " Calories");
		System.out.println(minutesPlayingBasketball + " minutes playing basketball = " + calsUsedPlayingBasketball + " Calories");
		System.out.println(hoursSleeping + " hours sleeping = " + calsUsedSleeping + " Calories");
		System.out.println("That is " + totalCalsUsed + " Calories for all activities.");
	}
	
	
}
