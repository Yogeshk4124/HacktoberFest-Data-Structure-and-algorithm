package InputTypes;
import java.io.*;

class Buffered_Reader
{
    public static void main()throws IOException
    {
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter a  number");
        int n;
        n=Integer.parseInt(inp.readLine());
        
        System.out.printf("You entered:%d",n);
        
    }
}