import java.util.Scanner;
class b2d
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter the binary number");
        s=sc.nextLine();
        int n=0;
        int j=0;
        int k=1;
        for(int i=s.length()-1;i>=0;i--)
        {
            n=n+(((int)s.charAt(i)-'0')*k);
            k=k*2;
        }
        System.out.println("The decimal number is given by : " +n);
    }
}