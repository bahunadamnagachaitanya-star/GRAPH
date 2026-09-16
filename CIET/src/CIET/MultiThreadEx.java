package CIET;

public class MultiThreadEx {
	public static void main(String[] args) {
		Thread t1=new Thread(()->{
				System.out.println("task 1 is running");
		});
		Thread t2= new Thread(()->{
			System.out.println("task 2 is running");
		});
		t1.start();
		t2.start();
				
	}

}
