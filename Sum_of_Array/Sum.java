import java.util.Scanner;
class Sum
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter the size of the Array : ");
        n=sc.nextInt();
        int []A=new int[n];
        System.out.println("Enter the array elements to find the sum : ");
        for(int i=0;i<n;i++)
        {
        A[i]=sc.nextInt();
        sum+=A[i];
        }
        System.out.println("The sum of all the elements in the entered array is : "+sum);
    }
}