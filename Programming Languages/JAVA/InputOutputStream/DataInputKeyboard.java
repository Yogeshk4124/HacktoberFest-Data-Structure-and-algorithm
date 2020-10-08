import java.io.*;
import java.util.*;

class DataInputKeyboard
{
    public static void main(String args[])throws IOException
    {
        int n;
        
        System.out.println("[Data Input Stream]");
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter a  number");
        n=Integer.parseInt(dis.readLine());
        System.out.printf("You entered:%d",n);
        System.out.flush();
        System.out.println("\n");
        System.out.println("[Buffered Reader]");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter a  number");
        n=Integer.parseInt(br.readLine());
        System.out.printf("You entered:%d",n);
		System.out.flush();
		System.out.println("\n");
		System.out.println("[Scanner]");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a  number");
        n=s.nextInt();
        System.out.printf("You entered:%d",n);
		System.out.flush();       
    }
}