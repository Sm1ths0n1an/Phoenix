package absoluteJava.chapter01.programmingProjects;

public class PigLatin {
	public static final String PIG_LATIN_SUFFIX = "ay";
	
	private static String firstName;
	private static String lastName;
	private static String pigLatinFirstName;
	private static String pigLatinLastName;
	
	public static String toPigLatin(String input){
		String firstIsLast = input.substring(1) + input.charAt(0);
		String capitalized = firstIsLast.substring(0,1).toUpperCase() + firstIsLast.substring(1);
		String result = capitalized + PIG_LATIN_SUFFIX;
		
		return result;
	}
	
	public static void main(String[] args){
		firstName = "walt";
		lastName = "savitch";
		
		System.out.println("Setting first name to " + firstName + " and setting last name " + lastName);
		
		pigLatinFirstName = toPigLatin(firstName);
		pigLatinLastName = toPigLatin(lastName);
		
		System.out.println("In pig latin this name would be:\n" + pigLatinFirstName + " " + pigLatinLastName);
	}
}
