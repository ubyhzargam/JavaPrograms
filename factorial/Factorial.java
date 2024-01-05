import java.util.Scanner;
class Factorial
{
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        int f=1;
        System.out.println("Enter a number to find it's factorial : ");
        n=sc.nextInt();
        for(int i=n;i>0;i--)
        f=f*i;
        System.out.println("The factorial of "+n +" is "+ f);
    }
}