package CIET;

class Student08 implements Comparable<Student08>{
	int marks;
	Student08(int marks){
		this.marks=marks;
	}
	@Override
	public int compareTo(Student08 other) {
		return this.marks-other.marks;
	}
}

public class CompareEx {
	public static void main(String[] args) {
		Student08 s1=new Student08(80);
		Student08 s2=new Student08(90);
		int s=s1.compareTo(s2);
		System.out.println(Math.abs(s));
	}

}
