package CIET;
//import java.util.*;

import java.util.HashMap;

public class HashmapEx {
	public static void main(String[] args) {
		HashMap<Integer,String> scanner=new HashMap<>();
		scanner.put(101, "Chaitanya");
		scanner.put(null, "Chaitanya");
		scanner.put(102, "jaswanth");
		scanner.put(103,"ajith");
		System.out.println(scanner);
		System.out.println(scanner.get(101));
		System.out.println(scanner.containsKey(101));
		System.out.println(scanner.containsValue("john"));
		
		
		
	}

}
