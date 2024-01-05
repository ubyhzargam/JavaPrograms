import java.util.Scanner;
class Sorted
{
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        n=sc.nextInt();
        int A[]=new int[n];
        int flag=0;
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            if(A[i]<A[i-1])
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println("The elements in the entered array are sorted");
        else 
        System.out.println("The numbers in the entered array are not sorted ");
    }
}