import java.util.Scanner;
class Subset
{
    private static int Sub(String s, String c, int n)
    {
        int c1=0;
        if(n>=s.length())
        {
            System.out.print(c+" ");
            return 1;
        }
        c1=c1+Sub(s,c,n+1);
        c1=c1+Sub(s,c+s.charAt(n),n+1);
        return c1;
    }
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to find it's substrings");
        String s=sc.nextLine();
        System.out.println("The substrings of the given string are given by ");
        System.out.println("The total number of subsets = "+Sub(s,"",0));
    }
}