class DataRace extends Thread{
	static int x;
	public void run(){
		for(int i=0;i<10;i++){
			x=x+1;
			System.out.println(x);
			x=x-1;
		}
	}
	public static void main(String[] args) {
		x=0;
		for(int i=0;i<100;i++)
			new DataRace().start();
		System.out.println(x);
	}
}