import java.util.*;
import java.io.*;
public class BalanceCube {
    public static void main(String[] args){
        PrintWriter out=new PrintWriter(System.out);
        Myscanner s=new Myscanner();
        long n=s.nextInt();
		long N=0;
		int count=0;
			
				 while(n>1){
             count++;
             N=n;
             n=(long)Math.ceil(N/3.0);

         }
		  out.println(count);
          out.flush();
        
    }
    	
    static class Myscanner{
        private BufferedReader br;
        private StringTokenizer tr;
        public Myscanner()
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        public String next(){
            try{
                while(tr==null||!tr.hasMoreTokens())
                {
                    tr=new StringTokenizer(br.readLine());
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return tr.nextToken();
        }
        public int nextInt()
        {
            return Integer.parseInt(next());
        }
        public long nextLong()
        {
            return Long.parseLong(next());
        }
    }
}
