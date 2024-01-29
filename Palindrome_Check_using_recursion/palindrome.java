import java.util.Scanner;
class palindrome
{
    
    private static boolean isPal(String s, int low, int high)
    {
        if(low>=high)
        return true;
        return (s.charAt(low)==s.charAt(high))&&(isPal(s,low+1,high-1));
    }
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a string s to find whether it is palindrome or not");
        s=sc.nextLine();
        boolean b;
        b=isPal(s,0,s.length()-1);
        if(b)
        System.out.println("The entered string is palindromic in nature");
        else
        System.out.println("The given string is not palindromic in nature");
    }
}