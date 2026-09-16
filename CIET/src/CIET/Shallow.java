package CIET;

public class Shallow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40};
		int[] b=a.clone();
		b[0]= 200;
		System.out.println(a[0]);
		System.out.println(b [0]);

	}

}
