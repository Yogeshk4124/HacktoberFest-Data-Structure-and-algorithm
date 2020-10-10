class A extends Thread{
	public void run(){
		System.out.println("Thread A started");
		for(int i=0;i<11;i++)
			System.out.println("ProcessingA...."+10*i+"%");
		System.out.println("Thread A ended");
	}
}

class B extends Thread{
	public void run(){
		System.out.println("Thread B started");
		for(int i=0;i<11;i++)
			System.out.println("ProcessingB...."+10*i+"%");
		System.out.println("Thread B ended");
	}
}

class C extends Thread{
	public void run(){
		System.out.println("Thread C started");
		for(int i=0;i<11;i++)
			System.out.println("ProcessingC...."+10*i+"%");
		System.out.println("Thread C ended");
	}
}

class ThreadPriority{
	public static void main(String[] args) {
		System.out.println("Main thread starts here");

		A threadA=new A();
		B threadB=new B();
		C threadC=new C();

		threadC.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(threadA.getPriority()+1);
		threadC.setPriority(Thread.MIN_PRIORITY);
		threadA.start();
		threadB.start();
		threadC.start();
		System.out.println("Main thread ends here");
	}
}