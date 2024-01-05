import java.util.Scanner;
class decimaltobinary
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        int n;
        System.out.println("Enter a decimal number");
        n=sc.nextInt();
        while(n>0)
        {
            s=(n%2)+s;
            n=n/2;
        }
        System.out.println("The entered number in binary is given by : "+s);
    }
}