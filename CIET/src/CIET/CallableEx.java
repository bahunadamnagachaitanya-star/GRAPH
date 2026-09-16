package CIET;
import java.util.concurrent.*;
public class CallableEx {
	public static void main(String[] args) 
		throws Exception{
			ExecutorService executor=Executors.newFixedThreadPool(2);
			Callable<Integer> task=()->{
				System.out.println(
						 "calculating..."
						);
				Thread.sleep(2000);
				return 10+20;
			};
			Future<Integer> future =executor.submit(task);
			System.out.println(
					 "taskcompleted..."
					);
			Integer result=future.get();
			System.out.println(
					"Result = "+result
					);
			executor.shutdown();
		}
	}

