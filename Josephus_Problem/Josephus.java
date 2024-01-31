import java.util.Scanner;
class Josephus
{
    private static int Josephus(int n,int k)
    {
        if(n==1)
        return 1;
        return (Josephus(n-1,k)+k-1)%n+1;
    }
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of persons in a circle so that you get the position to stand at to save your life !!");
        n=sc.nextInt();
        System.out.println("Enter the count of people who are killed i.e., k ");
        int k=sc.nextInt();
        System.out.println("Stand at position "+Josephus(n,k));
    }
}