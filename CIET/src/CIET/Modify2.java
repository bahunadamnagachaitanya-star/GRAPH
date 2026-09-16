package CIET;

import java.util.Scanner;

public class Modify2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		String result="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch >='A' && ch <='Z') {
				ch=(char)(ch+32);
			}
			result = result+ ch;
		}
		System.out.println(result);
		sc.close();
		
		

	}

}
