package CIET;
interface Calculator2{
	int add(int a,int b);
}

public class LambdaEx {
	public static void main(String[] args) {
		Calculator2 c=(a,b)->a+b;
		int result = c.add(10,20);
		System.out.println(result);
		System.out.println(c.add(29, 33));
	}

}
