package CIET;
interface sum{
	int add(int a,int b);
}

public class LambdaEx1 {
	public static void main(String[] args) {
		sum c=(a,b)->{
	            int result= a+b;
	            return result;
		};
		int answer=c.add(25, 30);
		System.out.println(answer);
	}

}
