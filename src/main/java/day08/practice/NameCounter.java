package day08.practice;

import java.util.*;

public class NameCounter {
   
	public static void main(String[] args) {
		String input = "Ram, Ram, Superman, spider, hey, hello, hey, Spider";
		
		String[] names = input.split(",\\s*");
		
		System.out.println("Hash Map");
		
		Map<String, Integer> nameCounts = new HashMap<>();
		for (String name : names) {
			nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
		}
		
		for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println("Tree Map");
		
		Map<String, Integer> nameAndCounts = new TreeMap<>();
		for (String name : names) {
			nameAndCounts.put(name, nameAndCounts.getOrDefault(name, 0) + 1);
		}
		
		for (Map.Entry<String, Integer> entry : nameAndCounts.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}

