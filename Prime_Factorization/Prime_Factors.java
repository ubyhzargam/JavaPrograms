import java.util.Scanner;
class Prime_Factors
{
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print it's prime factors ");
        n=sc.nextInt();
        printPF(n);
    }
    
    public static boolean isPrime(int n)
    {
        if(n==1)
        return false;
        if(n==2||n==3)
        return true;
        if(n%2==0||n%3==0)
        return false;
        for(int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    
    public static void printPF(int n)
    {
        int x=0;
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                x=i;
                while(n%x==0)
                {
                    System.out.print(i+" ");
                    x=x*i;
                }
            }
        }
        System.out.println();
    }
}