 package CIET;
//import java.util.Scanner;
class Animal1{
	void eat() {
		System.out.println("Animal is eating");
	}
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("Dog barks");
	}
}
class cat extends Dog1{
	void meow() {
		System.out.println("cat meow");
	}
}
class Rat extends cat{
	void hide() {
		System.out.println("rat hides");
	}
}

public class Multiinherit {
	public static void main(String[] args) {
		Rat r=new Rat();
		r.eat();
		r.bark();
		r.meow();
		r.hide();
		
		
	}
}
