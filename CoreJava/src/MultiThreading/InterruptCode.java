package MultiThreading;

public class InterruptCode {
	public static void main(String[] args) throws Exception {
		Mythread t1 = new Mythread();
		t1.start(); // 5 sec 

		Thread.sleep(2000); // main thread for 2 sec
		t1.interrupt();
	}
}

class Mythread extends Thread {
	public void run() {
		try {
			System.out.println("Thread going to sleep....");
			Thread.sleep(5000);
			System.out.println("Thread woke up normally");
		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted while sleeping");
		}
	}
}