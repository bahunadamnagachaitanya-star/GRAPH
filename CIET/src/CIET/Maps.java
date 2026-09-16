package CIET;
//import java.util.Scanner;
import java.util.*;
public class Maps {
	public static void main(String[] args) {
		Map<Integer,String> students=new HashMap<>();
		students.put(100, "Chaitanya");
		students.put(101, "jaswanth");
		students.put(102,"ajith");
		students.put(103, "nikhil");
		System.out.println(students);
		System.out.println(students.get(100));
		students.remove(101);
		System.out.println(students);
		students.put(100,"rajesh");
		System.out.println(students);
		
	}

}
