package Multithreading;

class MyThread{
	public static void main(String[] args) {
		System.out.println("Multithreading starts here");

		threadA1 a=new threadA1();
		threadB2 b=new threadB2();
		threadC3 c=new threadC3();

		a.start();
		b.start();
		c.start();

		System.out.println("Multithreading ends here");
	}
}

class threadA1 extends Thread{
	public void run(){
		System.out.println("Thread A");
	}
}

class threadB2 extends Thread{
	public void run(){
		System.out.println("Thread B");
	}
}

class threadC3 extends Thread{
	public void run(){
		System.out.println("Thread C");
	}
}

