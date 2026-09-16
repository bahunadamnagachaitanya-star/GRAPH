package CIET;
class parent{
	parent(){
		System.out.println("inside constructor");
	}
	void son() {
		System.out.println("inside son");
	}
}
class Child2 extends Parent{
	Child2(){
	super();
	System.out.println("inside child class");
}
}
public class SuperEx1 {
	public static void main(String[] args) {
		Child2 c=new Child2();
		
	}

}
