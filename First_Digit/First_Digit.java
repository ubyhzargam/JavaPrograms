import java.util.Scanner;
class First_Digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number to find it's first digit :");
        n=sc.nextInt();
        int power=(int)Math.log10(n);
        int f=n/(int)(Math.pow(10,power));
        System.out.println("The first digit of the entered number is given by : " + f);
    }
}