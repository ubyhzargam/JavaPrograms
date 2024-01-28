import java.util.Scanner;
class Print
{
    
    private static void print(int n)
    {
        if (n==0)
        return;
        print(n-1);
        System.out.print(n+" ");
    }
    
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n to print elements from 1 to N");
        n=sc.nextInt();
        print(n);
        System.out.println();
    }
}