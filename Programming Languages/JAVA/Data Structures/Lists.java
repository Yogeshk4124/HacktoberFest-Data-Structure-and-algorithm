import java.util.*;

class Lists{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);

		List<Integer> li=new ArrayList<Integer>();
		System.out.println("Enter the size of Lists");
		int n=in.nextInt();
		System.out.println("Enter the elements of list");
		int i=n;
		while(i>0){
			int e=in.nextInt();
			li.add(e);
			i--;
		}

		System.out.println("You entered:\t"+li);

		System.out.println("Enter the position and element where it is to be inserted");
		int pos=in.nextInt();
		int element=in.nextInt();
		li.add(pos,element);

		System.out.println("Your List:\t"+li);


		System.out.println("Enter the element position and element");
		int pos=in.nextInt();
		int element=in.nextInt();
		li.add(pos,element);

		System.out.println("Enter the position to be deleted");
		pos=in.nextInt();
		li.remove(pos);
		System.out.println("Your List:\t"+li);
	}
}