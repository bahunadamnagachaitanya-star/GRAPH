package CIET;
class Parent08{
	//private int x=20;
	int b=20;
}
class child extends Parent08{
	void show() {
		System.out.println(b);
	}
}

public class Private {
	public static void main(String[] args) {
		child c=new child();
		c.show();
		
	}

}
