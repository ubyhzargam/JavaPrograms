import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number to check whether it is prime or not : ");
        n=sc.nextInt();
        boolean prime=Prime(n);
        if(prime)
        System.out.println("The number entered is Prime");
        else
        System.out.println("The number entered is not Prime");
    }
    public static boolean Prime(int n)
    {
        if(n==1)
        return false;
        if(n==2||n==3)
        return true;
        if(n%2==0||n%3==0)
        return false;
        else
        {
            for(int i=5;i*i<=n;i=i+6)
            {
                if(n%i==0||n%(i+2)==0)
                return false;
            }
        }
        return true;
    }
}