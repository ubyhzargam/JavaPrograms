import java.util.Scanner;
class Recursion
{
    
    private static int Fibonacci(int n)
    {
        if(n==0||n==1)return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter n to find nth term fibonacci term");
        n=sc.nextInt();
        int fib=Fibonacci(n);
        System.out.println(n+ " term fibonacci number is "+fib);
    }
}