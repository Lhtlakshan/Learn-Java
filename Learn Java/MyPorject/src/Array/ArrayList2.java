package Array;
import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {


//ArrayList a resizable array. Elements can  be 
//added or removed after compilation phase store reference data types
    
		ArrayList<String> fish = new ArrayList<String>(5); //5 is optional
		
		fish.add("Tuna");
		fish.add("You win");
		
		String x = fish.get(1);
		fish.get(1);
		
		System.out.println(x);
		
		LinkedList<String> hi = new LinkedList<String>();
		hi.add("You can do it");
		System.out.println(hi.get(0));
		

	}
	
}