package CIET;
class Animal{
	void eat() {
		System.out.println("animal eats");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}
class Cat extends Animal{
	void meow() {
		System.out.println("meowing");
	}
}

public class Highrarchy {
	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c= new Cat();
		d.bark();
		d.eat();
		c.meow();
		c.eat();
		
		
	}

}
