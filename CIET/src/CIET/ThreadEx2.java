package CIET;

public class ThreadEx2 {
	public static void main(String[] args) {
		Thread t1= new Thread(()->{
			for(int i=1;i<=5;i++) {	
				System.out.println("Thread "+i);
			}
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
				}
		});
		Thread t2= new Thread(()-> {
			for(int i=1;i<=5;i++) {	
				System.out.println("Thread 2: "+i);
			}
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
				}
		});
		t1.start();
		t2.start();
	}

}
