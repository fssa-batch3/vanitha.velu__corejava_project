package day09.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        
        // Read the input numbers from the user and store them in an ArrayList
        ArrayList<Integer> numbersList = new ArrayList<>();
        String input = scanner.nextLine();
        String[] numbersArray = input.split("\\s+");
        
        for (String numStr : numbersArray) {
            try {
                int num = Integer.parseInt(numStr);
                numbersList.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + numStr + " is not a valid integer.");
            }
        }
        
        // Sort the ArrayList
        Collections.sort(numbersList);
        
        // Print the sorted list
        System.out.print("Sorted list: ");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(numbersList.get(i));
            if (i < numbersList.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}

