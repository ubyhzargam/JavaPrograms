import java.util.Scanner;
class palindrome1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1;
        System.out.println("Enter the string");
        s1=sc.nextLine();
        int start=0,end=s1.length()-1;
        while(start<=end)
        {
            if(s1.charAt(start++)==s1.charAt(end--))
            continue;
            else
            break;
        }
        if(start>end)
        System.out.println("The entered String is Palindromic in nature");
        else
        System.out.println("The entered String is not Palindromic in nature");
    }
}