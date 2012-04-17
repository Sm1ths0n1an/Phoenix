package absoluteJava.chapter01.programmingProjects;

public class HateToLove {
	public static final String HATE = "hate";
	public static final String LOVE = "love";
	
	private static String input;
	private static String output;
	
	public static String convertHateToLove(String input){
		if (input.indexOf(HATE) != -1){
			return input.substring(0, input.indexOf(HATE)) + LOVE + input.substring(input.indexOf(HATE) + HATE.length());
		} else {
			return input;
		}
	}
	
	public static void main(String[] args){
		input = "I hate you.";
		
		System.out.println("The line of text to be changed is:\n" + input);
		
		output = convertHateToLove(input);
		
		System.out.println("I have rephrased that line to read:\n" + output);
	}
}
