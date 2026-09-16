package CIET;
import java.util.Scanner;
class Animals{
	void eat() {
		System.out.println("Animal is eating");
	}
}
class Dogs extends Animals{
	void bark() {
		System.out.println("Dog barks");
	}
}
public class Inherit {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.bark();
	}

}
