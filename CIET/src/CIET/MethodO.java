package CIET;

public class MethodO {
	void add(int a) {
		System.out.println(a);	
	}
	void add(double a) {
		System.out.println(a);	
	}
	void add(int b,int c) {
		System.out.println(b+c);	
	}
	public static void main(String[] args) {
		 MethodO z=new  MethodO();
		 z.add(11);
		 z.add(33.4);
		 z.add(45,66);
		 
		
	}
}
