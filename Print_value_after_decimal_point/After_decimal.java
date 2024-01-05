import java.util.Scanner;
class After_decimal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter the decimal number");
        s=sc.nextLine();
        int pos=s.indexOf('.');
        System.out.println("The digits after decimal point are : "+s.substring(pos+1));
    }
}