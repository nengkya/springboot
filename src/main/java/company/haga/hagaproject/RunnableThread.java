/*
RunnableThread ~> Thread that is Runnable. Noun. Kata benda.
ThreadRunnable ~> Thread that is Runnable. Adjective. Kata sifat.
*/

class RunnableThread implements Runnable {

	public void run() {
		System.out.println("Thread is running ...");
	}

	public static void main(String[] arguments) {

		RunnableThread runnableThread = new RunnableThread();

		Thread thread = new Thread(runnableThread);

		thread.start();

	}

}
