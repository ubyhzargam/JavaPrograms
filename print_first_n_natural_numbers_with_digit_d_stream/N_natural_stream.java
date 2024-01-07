import java.util.Scanner;
import java.util.stream.*;
class N_natural_stream
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,d;
        System.out.println("Enter the number of terms you want ");
        n=sc.nextInt();
        System.out.println("Enter the digit d you want these natural numbers to have ");
        d=sc.nextInt();
        Stream.iterate(1,x->x+1)
              .filter(x->x.toString().contains(Integer.toString(d)))
              .limit(n)
              .forEach(System.out::println);
    }
}