import java.util.Scanner;
class Divisor
{
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find it's divisors : ");
        n=sc.nextInt();
        System.out.println("The divisors of the entered number are given by : ");
        for(int i=1;i*i<n*n;i++)
        {
            if(n%i==0)
            System.out.print(i+ " ");
        }
        for(int i=(int)Math.sqrt(n);i>=1;i--)
        {
        if(n%i==0)
        System.out.print(n/i + " ");
        }
    }
}