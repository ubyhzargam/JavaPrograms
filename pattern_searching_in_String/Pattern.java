import java.util.Scanner;
class Pattern
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter the first string");
        s=sc.nextLine();
        String s1;
        System.out.println("Enter the pattern to be found in the entered String");
        s1=sc.nextLine();
        int pos=s.indexOf(s1);
        if(pos==-1)
        System.out.println("The pattern was not found in the string entered ");
            while(pos>=0)
                {
                    System.out.print(pos+" ");
                    pos=s.indexOf(s1,pos+1);
                }
            System.out.println();
    }
}