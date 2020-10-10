package TryCatchBlock;
import java.util.*;

class tryCatch5
{
    public static void main()
    {
        int a=13;
        try
        {
            if(a==13)
            throw new MyException("Exception Message");
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
