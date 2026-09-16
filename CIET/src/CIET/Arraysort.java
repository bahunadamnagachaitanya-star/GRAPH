package CIET;
import java.util.Arrays;

public class Arraysort {

	public static void main(String[] args) {
		int numbers[]= {40,23,12,19,3};
		System.out.println("Arrays before sorting");
		System.out.println(Arrays.toString(numbers));
		System.out.println("Arrays after  sorting");
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	
	}

}
