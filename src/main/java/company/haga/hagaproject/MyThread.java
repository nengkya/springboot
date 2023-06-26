public class MyThread extends Thread {

	/*thread action*/
	public void run() {
		System.out.println("Thread object is executed with start() method.");
		System.out.println("Thread object action using run() method.");
	}


	public static void main(String[] arguments) {
		MyThread myThread = new MyThread();
		/*thread execution*/
		myThread.start();
	}

}
