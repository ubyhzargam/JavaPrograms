import java.math.BigInteger;
import java.util.Scanner;
class Prime_nextPrime
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number to check whether it is prime or not and to find the next consecutive prime number");
        n=sc.nextInt();
        BigInteger a=BigInteger.valueOf(n);
        if(a.isProbablePrime(1))
        System.out.println("The entered number is a prime number");
        else
        System.out.println("The entered number is not a prime number");
        System.out.println("The next probable prime number after the entered number is :" + (a.nextProbablePrime()).intValue());
    }
}