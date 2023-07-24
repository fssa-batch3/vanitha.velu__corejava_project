package weekly_Assessment2;

import java.util.ArrayList;
import java.util.*;
public class Assessment2 {
	public static void main(String[] args) {
	
	ArrayList<String> nameList = new ArrayList<String>(); 
	nameList.add("Manoj");
	nameList.add("Deepak");
	nameList.add("Ramesh");
	nameList.add("Benny");

	System.out.println("HR:" + nameList); 
	Collections.sort(nameList); 
	System.out.println("IT:" + nameList);
	
    }

}



