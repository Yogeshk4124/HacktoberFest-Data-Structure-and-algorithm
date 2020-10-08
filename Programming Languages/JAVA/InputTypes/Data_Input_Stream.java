package InputTypes;

import java.io.*;

class Data_Input_Stream
{
    public static void main()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        
        System.out.println("Enter a  number");
        int n;
        n=Integer.parseInt(in.readLine());
        
        System.out.printf("You entered:%d",n);
        
    }
}