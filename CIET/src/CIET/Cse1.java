//with temp
package CIET;
import java.util.Scanner;

public class Cse1 {
	public static void main(String[] args) {
		Scanner z= new Scanner(System.in);
		System.out.println("Enter frst number");
		int a=z.nextInt();
		System.out.println("enter2nd number"); 
		int b= z.nextInt();
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping :" + a);
		System.out.println("after swapping :" + b);
		
		
	}

}


/* without temp
a= a+b;
b=a-b;
a= a-b;
*/
