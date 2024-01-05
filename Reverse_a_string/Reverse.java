import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a String");
        s=sc.nextLine();
        String s1="";
        for(int i=(s.length()-1);i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }
        System.out.println("The String in reverse order is given by : "+s1);
    }
}