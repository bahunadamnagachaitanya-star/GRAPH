package CIET;
import java.util.Scanner;

public class Lo3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the fsrt number");
		int a= s.nextInt();
		System.out.println("enter the 2nd number");
		int b= s.nextInt();
		System.out.println("enter the 3rd number");
		int c=s.nextInt();
  if(a>=b && a>=c)
			System.out.println("largest :" + a);
		else if(b>=a && b>=c)
			System.out.println("largest :" + b);
		else 
			System.out.println("largest :" + c);
		
		
	}

}
