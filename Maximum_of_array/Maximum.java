import java.util.Scanner;
class Maximum
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int max=Integer.MIN_VALUE;
        System.out.println("Enter the number of elements in the array : ");
        n=sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int []A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
            if(A[i]>max)
            max=A[i];
        }
        System.out.println("The maximum element in the entered array is : "+max);
    }
}