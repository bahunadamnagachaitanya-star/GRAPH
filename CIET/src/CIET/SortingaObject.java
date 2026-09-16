package CIET;
import java.util.*;
class Student09 implements Comparable<Student09>{
	String name;
	int marks;
	Student09(int marks,String name){
		this.marks=marks;
		this.name=name;
	}
	@Override
	public int compareTo(Student09 other) {
		return this.marks-other.marks;//dec other.marks-this.marks 
	}
	public String toString() {
		return name+" "+marks;
	}
}

public class SortingaObject {
	public static void main(String[] args) {
	List<Student09> students=new ArrayList<>();
	students.add(new Student09(90,"chaitanya"));
	students.add(new Student09(55,"ajith"));
	//List<Student09> collections;
	Collections.sort(students);
	System.out.println(students);
	
	}

}
