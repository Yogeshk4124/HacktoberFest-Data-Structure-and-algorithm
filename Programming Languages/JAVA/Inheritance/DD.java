package Inheritance;

class DD extends AA
{
    public void print()
    {
        System.out.println("I am D");
        System.out.println("x="+x);
    }
    public static void main()
    {
        DD ob=new DD();
        ob.display();
        ob.print();
    }
}