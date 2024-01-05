import java.util.Scanner;
class C
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find it's last digit");
        int n=sc.nextInt();
        int n1=Math.abs(n);
        int last=n1%10;
        System.out.println("The last digit of the number " + n + " is " + last);
    }
}