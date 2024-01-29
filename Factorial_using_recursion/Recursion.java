import java.util.Scanner;
class Recursion
{
    
    private static int factorial(int n)
    {
        if(n==0)return 1;
        return n*factorial(n-1);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number to find it's factorial");
        n=sc.nextInt();
        int fact=factorial(n);
        System.out.println("The factorial of "+n+" is "+fact);
    }
}