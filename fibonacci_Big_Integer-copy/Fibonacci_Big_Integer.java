import java.math.BigInteger;
import java.util.Scanner;
class Fibonacci_Big_Integer
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term upto which you want to display the Fibonacci sequence");
        int n;
        n=sc.nextInt();
        BigInteger a=new BigInteger("0");
        BigInteger b=new BigInteger("1");
        BigInteger c=new BigInteger("0");
        if(n>=1)
        System.out.print(a+" ");
        if(n>=2)
        System.out.print(b+" ");
        while(n-2>0)
        {
            c=a.add(b);
            a=b;
            b=c;
            System.out.print(c+" ");
            n--;
        }
        System.out.println();
    }
}