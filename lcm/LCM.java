import java.util.Scanner;
class LCM
{
    public static void main(String args[])
    {
        int n1,n2;
        int lcm=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to find their LCM : ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(int i=Math.max(n1,n2);i<n1*n2;i++)
        {
            if(i%n1==0&&i%n2==0)
            {
                lcm=i;
                break;
            }
        }
        System.out.println("LCM of entered numbers is :" + lcm);
    }
}