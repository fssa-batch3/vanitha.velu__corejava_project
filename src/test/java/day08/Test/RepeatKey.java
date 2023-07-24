package day08.Test;

	
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;
	public class RepeatKey {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the string: ");
			String input = scanner.nextLine();

		
			input = input.trim().toLowerCase();

			
			String[] names = input.split(",");

			HashMap<String, Integer> nameCount = new HashMap<>();

			for (String name : names) {
				nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
			}
			
			System.out.println(nameCount); 

		
			nameCount.forEach((key, value) -> System.out.println(key + ": " + value));
			
			scanner.close(); 

		}
	}
