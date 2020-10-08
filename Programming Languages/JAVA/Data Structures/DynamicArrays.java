import java.util.*;

class DynamicArrays{
	int a[];
	int size;
	int count;
	public DynamicArrays(){
		a=new int[1];
		size=1;
		count=0;
	}
	void addElement(int element){
		if(size==count){
			growSize();
		}
		a[count]=element;
		count++;
	}
	void growSize(){

			if(count==size){
				int temp[]=new int[2*size];

				for(int i=0;i<size;i++){
				temp[i]=a[i];
			}
			size=2*size;
			a=temp;
		}
	}

	void shrinkSize(){
		if(count>0){
			int temp[]=new int[count];
			for(int i=0;i<count;i++){
				temp[i]=a[i];
			}
			size=count;
			a=temp;
		}
	}
	void fullDisplay(){
		System.out.print("Dynamic Array :\t");
		for(int  i=0;i<size;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	void addElementAt(int element,int pos){
		if(count==size)
			growSize();

		for(int i=count-1;i>=pos;i--){
			a[i+1]=a[i];
		}
		a[pos]=element;
		count++;

	}
	void removeElement(){
		if(count>0){
			a[count-1]=0;
		}
		count--;
	}
	void removeElementAt(int pos){
		if (count>0) { 
            for (int i = pos;i<count-1;i++) {  
                a[i]=a[i+1]; 
            } 
            a[count-1] = 0; 
            count--; 
        } 
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);

		DynamicArrays ob=new DynamicArrays();
		
		for(int i=1;i<10;i++){
			ob.addElement(i);
		}
		ob.fullDisplay();
		System.out.println("Size of array is:\t"+ob.size);

		
		System.out.println("After Shrinking");
		ob.shrinkSize();

		ob.fullDisplay();	
		System.out.println("Size of array is:\t"+ob.size);

		System.out.println("Add element at:\t");
		int ele=in.nextInt();
		int pos=in.nextInt();
		ob.addElementAt(ele,pos);

		ob.shrinkSize();
		ob.fullDisplay();
		System.out.println("Size of array is:\t"+ob.size);

		System.out.println("After Deleting");
		ob.removeElement();

		ob.shrinkSize();
		ob.fullDisplay();	
		System.out.println("Size of array is:\t"+ob.size);

		System.out.println("Remove element at:\t");
		pos=in.nextInt();
		ob.removeElementAt(pos);

		ob.shrinkSize();
		ob.fullDisplay();	
		System.out.println("Size of array is:\t"+ob.size);

			
	}
}