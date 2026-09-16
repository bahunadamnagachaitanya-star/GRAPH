package CIET;
@FunctionalInterface
interface Greeting{
	void sayHello();
}

public class FinterfaceEx {
	public static void main(String[] args) {
		Greeting g= ()->System.out.println("Hello");
		g.sayHello();
	}

}
