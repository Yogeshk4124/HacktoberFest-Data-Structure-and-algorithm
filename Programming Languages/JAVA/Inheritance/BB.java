package Inheritance;

class BB extends AA
{
    public void output()
    {
        System.out.println("I am B");
    }
    public static void main()
    {
        BB ob=new BB();
        ob.display();
        ob.output();
    }
}