package CIET;
import java.util.Scanner;
import java.util.Arrays;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int original=num;
		int sum=0;
		while(num != 0) {
			int digit=num%10;
			sum=sum+(digit * digit * digit);
			num=num/10;
					
		}
		if(original == sum) {
			System.out.println(original + " is armstrong");
		}
		else 
			System.out.println("is not armstrong");
		
		

	}

}
