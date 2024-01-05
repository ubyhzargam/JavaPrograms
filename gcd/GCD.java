import java.util.Scanner;
class GCD
{
    public static void main(String []args)
    {
        int a,b;
        int gcd=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to find their GCD");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=Math.min(a,b);
        for(int i=2;i<c;i++)
        {
            if(a%i==0&&b%i==0)
            gcd=i;
        }
        System.out.println("The GCD of "+a+ " and "+b+" is :"+gcd); 
    }
}