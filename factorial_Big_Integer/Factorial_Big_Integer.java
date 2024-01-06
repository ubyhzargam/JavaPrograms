import java.math.BigInteger;
import java.util.Scanner;
class Factorial_Big_Integer
{
    public static void main(String []args)
    {
        System.out.println("Enter the number to find it's factorial");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        BigInteger A=new BigInteger("1");
        for(int i=n;i>1;i--)
        {
            BigInteger B=BigInteger.valueOf(i);
            A=A.multiply(B);
        }
        System.out.println("The factorial of entered number is : "+A);
    }
}