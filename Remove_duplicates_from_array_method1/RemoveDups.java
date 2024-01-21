import java.util.Scanner;
class RemoveDups
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array in ascending order to remove the duplicates from the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(n!=0)
        {
            System.out.println("The new array without duplicates is given by:");
            if(n==1)
            System.out.println(arr[0]);
            else
            {
            n=RemoveDups(arr);
            for(int i=0;i<n;i++)
            {
            System.out.print(arr[i]+" ");
            }
            System.out.println();
            }
        }
        else
        System.out.println("There are no elements in the array");
    }
    
    private static int RemoveDups(int []arr)
    {
        int n=arr.length;
        int temp[]=new int[n];
        temp[0]=arr[0];
        int res=1;
        for(int i=0;i<n;i++)
        {
            if(arr[res-1]!=arr[i])
            {
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
}