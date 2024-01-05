import java.util.Scanner;
class Distinct
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the Array : ");
        n=sc.nextInt();
        int []A=new int[n];
        int count=0,distinct=0;
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++)
        A[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<i;j++)
        {
            if(A[i]==A[j])
            {
                distinct=1;
                break;
            }
        }
            if(distinct==0)
            count++;
            distinct=0;
        }
        System.out.println("The number of distinct elements in the entered array are : "+count);
    }
}