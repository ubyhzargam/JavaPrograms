import java.util.Scanner;
class Fibonacci
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of terms to be printed in Fibonacci series : ");
        n=sc.nextInt();
        int a=1,b=1,c=0;
        System.out.println("The Fibonacci numbers are given by : ");
        if(n==0)
        return;
        else if(n==1)
        System.out.print(a);
        else if(n==2)
        System.out.print(a + " " + b);
        else
        {
            System.out.print(a+" "+b+ " ");
            while(n-2>0)
            {
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+" ");
                n--;
            }
        }
    }
}