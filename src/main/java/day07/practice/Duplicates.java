package day07.practice;


import java.util.ArrayList;
import java.util.List;

public class Duplicates {
	public static void main(String[] args) {

		List<String> cityList = new ArrayList<String>();
		cityList.add("1");
		cityList.add("3");
		cityList.add("24");
		cityList.add("3");

		List<String> uniqueCity = new ArrayList<>();
		for (String city : cityList) {
			if (!uniqueCity.contains(city)) {
				uniqueCity.add(city);
			}
		}

		for (String city : uniqueCity) {
			System.out.println(city);
		}

	}
}