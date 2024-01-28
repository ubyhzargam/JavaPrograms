import java.util.Scanner;
class Recursion_Print
{
    
    private static void print(int n)
    {
        if(n==0)
        return;
        else
        {
        System.out.print(n+" ");
        print(n-1);
        }
    }
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter n to print numbers from n to 1");
        n=sc.nextInt();
        print(n);
        System.out.println();
    }
}