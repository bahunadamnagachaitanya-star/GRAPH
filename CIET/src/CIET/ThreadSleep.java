package CIET;

public class ThreadSleep {
	public static void main(String[] args) {
		System.out.println("task start");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("task completed");
	}
}
