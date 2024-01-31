import java.util.Scanner;
class TOH
{
    private static int toh(int n, char A, char B, char C)
    {
        int c=0;
        if(n==1)
        {
            System.out.println("Move disc 1 from tower "+A+" to tower "+C);
            return 1;
        }
        c=c+toh(n-1,A,C,B);
        c=c+1;
        System.out.println("Move disc "+n+" from tower "+A+" to tower "+C);
        c=c+toh(n-1,B,A,C);
        return c;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of discs to be moved from tower A to tower C using tower B as auxillary tower");
        n=sc.nextInt();
        int c=toh(n,'A','B','C');
        System.out.println("The total number of steps taken to do this are "+c);
    }
}