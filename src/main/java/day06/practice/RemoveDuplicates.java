package day06.practice;


import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {

		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

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