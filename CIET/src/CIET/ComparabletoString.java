package CIET;
import java.util.*;
class Student10 implements Comparable<Student10>{
	String name;
	Student10(String name){
		this.name=name;
	}
	 @Override
	 public int compareTo(Student10 other) {
			return this.name.compareTo(other.name);
	 }
	 public String toString() {
		 return name;
	 }
}

public class ComparabletoString {
	public static void main(String[] args) {
		List<Student10> students=new ArrayList<>();
		students.add(new Student10("chaitanya"));
		students.add(new Student10("ajith"));
		students.add(new Student10("rahul"));
		students.add(new Student10("nikhil"));
		students.add(new Student10("jaswanth"));
		//before sorting 
		System.out.println("before sorting:");
		System.out.println(students);
		//after sorting
		System.out.println("after sorting : ");
		Collections.sort(students);
		System.out.println(students);
		
		
	}
}
