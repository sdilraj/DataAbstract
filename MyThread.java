
public class MyThread extends Thread {
	
	public void run() {
		System.out.println("Thread Running");
	}
	
	

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();

	}

}
