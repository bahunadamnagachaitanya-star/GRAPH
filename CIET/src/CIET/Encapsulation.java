package CIET;
class Student{
	private String name;
	private int age;
	void setNames(String name) {
		this.name=name;
	}
	void setAge(int age) {
		this.age=age;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Student s=new Student();
		s.setNames("chaitanya");
		s.setAge(22);
		System.out.println(s.getName());
		System.out.println(s.getAge());
	}
}
