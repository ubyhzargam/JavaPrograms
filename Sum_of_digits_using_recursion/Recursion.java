import java.util.Scanner;
class Recursion
{
    
    private static int Sod(int n)
    {
        if(n<=9)
        return n;
        return n%10 +Sod(n/10);
    }
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number to find it's sum of digits");
        n=sc.nextInt();
        int sod=Sod(n);
        System.out.println("The sum of digits of number "+n+" is "+sod);
    }
}