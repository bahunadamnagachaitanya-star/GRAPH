package CIET;

public class ThreadEx1 {
	public static void main(String[] args) {
		Thread t= new Thread(()->{
			System.out.println("thread  is running");
		});
		t.start();
	}

}
