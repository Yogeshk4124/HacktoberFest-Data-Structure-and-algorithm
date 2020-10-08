class ThreadExample extends Thread{
	public void run(){
		for(int i=0;i<3;i++){
			try{
				System.out.println("Going to sleep"+i);
				sleep((int)(Math.random()*5000));
				System.out.println("Waking up"+i);
			}
			catch(InterruptedException e){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Threading starts........");
		new ThreadExample().start();
		new ThreadExample().start();
		System.out.println("..........Threading ends");
	}
}