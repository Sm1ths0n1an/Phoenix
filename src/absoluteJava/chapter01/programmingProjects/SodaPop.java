package absoluteJava.chapter01.programmingProjects;

public class SodaPop {
	public static final double AMOUT_OF_AS_LETHAL_TO_MOUSE = 0.0001;
	public static final double WEIGTH_OF_MOUSE = 1;
	public static final int STARTING_WEIGHT_OF_DIETER = 100;
	public static final double DESIRED_WEIGHT_OF_DIETER = 70;
	public static final double PERCENTAGE_OF_AS_IN_DIET_SODA = 0.001;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AMOUT_OF_AS_LETHAL_TO_MOUSE + " liters of arteficial sweetener is lethal to a mouse of " + WEIGTH_OF_MOUSE + " kilograms");
		
		double weightMouseToFriendRatio = WEIGTH_OF_MOUSE / DESIRED_WEIGHT_OF_DIETER;
		double amountLethalToFriend = AMOUT_OF_AS_LETHAL_TO_MOUSE / weightMouseToFriendRatio;
		
		System.out.println("This means that the lethal amount of arteficial sweetener for a person of " + DESIRED_WEIGHT_OF_DIETER + " kilograms is " + amountLethalToFriend + " liters of Atr. Sweet.");
		
		double litersOfDietSodaLethal = amountLethalToFriend / PERCENTAGE_OF_AS_IN_DIET_SODA;
		
		System.out.println("If the percentange of AS in diet soda is " + PERCENTAGE_OF_AS_IN_DIET_SODA + ",\nthis would mean that a person of " + DESIRED_WEIGHT_OF_DIETER + " kilograms\ncould drink " + litersOfDietSodaLethal + " liter of diet soda before consuming the lethal amout os AS.");
		System.out.println("");
		System.out.println("");
	}

}
