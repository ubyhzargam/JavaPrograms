import java.util.Scanner;
class Runnable_interface
{
    public static void main(String args[])
    {
        Thread c=new Thread(new Test());
        c.start();
        for(int i=0;i<5;i++)
        System.out.println("Inside Main method");
    }
}
class Test implements Runnable
{
    public void run()
    {
        try
        {
        for(int i=0;i<5;i++)
        {
            System.out.println("Inside test method");
            Thread.sleep(1);
        }
        
        }
        catch(Exception e)
        {
            System.out.println("An error occured");
        }
    }
}

