package CIET;
import java.util.Arrays;

public class Warearcs {
	static int sum(int... numbers) {
		int total=0;
		for(int number:numbers) {
			total+=number;
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {10,200,30,40};
		int a=sum(numbers);
		System.out.println(a);
		
		
		

	}

}
