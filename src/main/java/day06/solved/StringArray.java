package day06.solved;

public class StringArray {

	public static void main(String[] args) {

		// How its stored in an normal array
		String[] cityArr = new String[5];
		cityArr[0] = "Chennai";
		cityArr[1] = "Banglore";
		cityArr[2] = "Mumbai";
		cityArr[4] = "Delhi";
	
		

		// Display the city names
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
	}
}
