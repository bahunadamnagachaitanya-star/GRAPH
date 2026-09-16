package CIET;
class Parent{
	private int x=10;
	public int get() {
		return x;
	}
}
class Child extends Parent{
	void show() {
		System.out.println(get());
	}
}

public class Get {
	public static void main(String[] args) {
	Child c= new Child();
	c.show();
	}

}
