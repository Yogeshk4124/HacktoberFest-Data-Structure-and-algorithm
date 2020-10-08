package Inheritance;
class Honda extends Bike
{
    void run()
    {
        System.out.println("Running Safetly");
    }
    public static void main()
    {
        Bike ob=new Honda();
        ob.run();
    }
}