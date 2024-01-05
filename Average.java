import java.util.Scanner;
class Average
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array : ");
        n=sc.nextInt();
        int []A=new int[n];
        int avg=0;
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
            avg+=A[i];
        }
        System.out.println("The average of the elements in the entered array is given by : "+ avg/n);
    }
}