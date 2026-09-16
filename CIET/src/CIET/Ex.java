package CIET;
class MyThread8 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class Ex {
	public static void main(String[] args) {
		MyThread8 t1=new MyThread8();
		MyThread8 t2=new MyThread8();
		t1.setName("chaitanya");
		t2.setName("ajith");
		t1.start();
		t2.start();
	 
		
	}

}
