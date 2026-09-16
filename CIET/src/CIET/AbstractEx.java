package CIET;
abstract class Animal3{
abstract void sound();
void eat() {
	System.out.println("animal eats");
}	
}
class Dog3 extends Animal3{
	void sound() {
		System.out.println("dog bows");
	}
}

public class AbstractEx {
	public static void main(String[] args) {
		Dog3 d=new Dog3();
		d.sound();
		d.eat();
	}

}
