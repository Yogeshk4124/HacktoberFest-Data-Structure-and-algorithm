package Inheritance;

class FF 
{
    public void output()
    {
        System.out.println("I am FF");
    }
    public static void main()
    {
        BB ob=new BB();
        ob.display();
        ob.output();
        //System.out.println(ob.xyz);
    }
}