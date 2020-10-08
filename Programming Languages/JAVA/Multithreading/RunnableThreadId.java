import java.util.*;

class RunnableThreadId implements Runnable{
	public void run(){
		System.out.println("Thread "+Thread.currentThread().getId()+" is runnning");
	}
	public static void main(String[] args) {
		new Thread(new RunnableThreadId()).start();
		new Thread(new RunnableThreadId()).start();
		new Thread(new RunnableThreadId()).start();
		new Thread(new RunnableThreadId()).start();
		new Thread(new RunnableThreadId()).start();
		new Thread(new RunnableThreadId()).start();
	}
}