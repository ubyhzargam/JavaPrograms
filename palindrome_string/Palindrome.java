import java.util.Scanner;
class Palindrome
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s1;
        System.out.println("Enter the string");
        s1=sc.nextLine();
        String s2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        if(s2.equals(s1))
        System.out.println("The given string is Palindromic in nature");
        else
        System.out.println("The given string is not Palindromic in nature");
    }
}