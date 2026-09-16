package CIET;
import java.util.Scanner;

public class Abs {
	public static void main(String[] args) {
try {
	int result=10/0;
}catch(ArithmeticException e) {
	System.out.println(e.getMessage());
	e.printStackTrace();
}		
	}
}
