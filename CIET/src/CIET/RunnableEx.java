package CIET;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class MyTask2 implements Runnable{
	private String taskName;
	MyTask2(String taskName){
		this.taskName=taskName;
	}
	public void run(){
		System.out.println(taskName +" "+Thread.currentThread().getName());	
	try {
		Thread.sleep(3000);
	}catch(InterruptedException e) {
		System.out.println(e);
	}
}
public class RunnableEx {
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(3);
		executor.execute(new MyTask2("task 1"));
		executor.execute(new MyTask2("task 2"));
		executor.execute(new MyTask2("task 3"));
		executor.shutdown();
	}
	
}
 
}