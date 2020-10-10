package Inheritance;

class CC extends AA
{
    public void out()
    {
        System.out.println("I am C");
        System.out.println("x="+x);
    }
    public static void main()
    {
        CC ob=new CC();
        ob.display();
        ob.out();
    }
}