import java.util.*;

class ThreadId extends Thread{
	public void run(){
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
	}
	public static void main(String[] args) {
		new ThreadId().start();
		new ThreadId().start();
		new ThreadId().start();
		new ThreadId().start();
		new ThreadId().start();
		new ThreadId().start();
	}
}