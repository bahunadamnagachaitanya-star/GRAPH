package CIET;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FrameworkEx {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(()->{
			System.out.println("task 1 is executed by"+Thread.currentThread().getName());
		});
		executor.submit(()->{
			System.out.println("task 2 is executed by"+Thread.currentThread().getName());
		});
		executor.submit(()->{
			System.out.println("task 3 is executed by"+Thread.currentThread().getName());
		});
		executor.submit(()->{
			System.out.println("task 4 is executed by"+Thread.currentThread().getName());
		});
		executor.shutdown();
	}
}
