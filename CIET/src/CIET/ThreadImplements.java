package CIET;
class MyThread1 implements Runnable{
	@Override
	public void run() {
		System.out.println("task runnning");
	}
}

public class ThreadImplements {
	public static void main(String[] args) {
		Thread thread=new Thread(new MyThread1());
		thread.start();
	}

}
