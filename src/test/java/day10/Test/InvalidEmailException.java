package day10.Test;

public class InvalidEmailException {
	
	public static void main(String[] args) {

		String email = "surya.umapathy@freshworks.com";
		String regex = "^.*@.*\\..*$";

		Boolean isMatch = Pattern.matches(regex, email);

		if (isMatch) {
			System.out.println("The email address is: Valid");
		} else {
			System.out.println("The email address is: Invalid");
		}

	}

}
