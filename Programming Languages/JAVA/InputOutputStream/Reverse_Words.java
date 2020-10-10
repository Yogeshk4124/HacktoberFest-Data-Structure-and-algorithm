import java.util.*;
class Reverse_Words
{
    String S;
    String s;
    Reverse_Words(String t)
    {
        S=t;
    }
    Reverse_Words()
    {
        s="";
    }
    void Reverse()
    {
        int l=S.length();
        String s1="";
        for(int i=0;i<l;i++)
        {
            char ch=S.charAt(i);
            if(Character.isWhitespace(ch))
            {
                s=s+s1+" ";
                s="";
            }
            else
            s1=ch+s1;    
        }
        System.out.println(s);
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Sentence:-");
        String S1=in.nextLine();
        S1=S1+" ";
        Reverse_Words ob1=new Reverse_Words(S1);
        Reverse_Words ob2=new Reverse_Words();
        ob2.Reverse();
    }
}
