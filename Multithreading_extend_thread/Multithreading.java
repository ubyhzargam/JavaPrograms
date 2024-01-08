import java.util.Scanner;
class Multithreading
{
    public static void main(String []args)
    {
        Test c=new Test();
        c.start();
        for(int i=0;i<5;i++)
        {
        System.out.println("Inside Main thread");
        }   
    }
}

class Test extends Thread
{
    public void run()
    {
        try
        {
        for(int i=0;i<5;i++)
        {
            System.out.println("Inside Test Class");
        //Thread.sleep(1);
        }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured");
        }
    }
}

