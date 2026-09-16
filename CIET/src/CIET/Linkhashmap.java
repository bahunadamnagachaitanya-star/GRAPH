package CIET;

import java.util.LinkedHashMap;

public class Linkhashmap {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map= new LinkedHashMap<>();
		map.put(3, "c");
		map.put(1, "a");
		map.put(2, "b");
		System.out.println(map);
	}

}
