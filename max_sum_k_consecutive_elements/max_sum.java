import java.util.Scanner;
class max_sum
{
    
    private static int MaxSum(int arr[],int k)
    {
        int maxsum=0,sum=0;
        int n=arr.length;
        if(n<k)
        return -1;
        else
        {
            for(int i=0;i<k;i++)
            maxsum+=arr[i];
            sum=maxsum;
            for(int i=k;i<n;i++)
            {
                sum=sum-arr[i-k]+arr[i];
                if(sum>maxsum)
                maxsum=sum;
            }
        }
        return maxsum;
    }
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the Array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the number of consecutive elements you want the maximum sum for :");
        int k;
        k=sc.nextInt();
        int maxsum=0;
        maxsum=MaxSum(arr,k);
        if(maxsum==-1)
        System.out.println("Invalid");
        else
        {
            System.out.println("The maximum sum of "+k+ " consecutive elements out of "+n+" elements in the array is " +maxsum);
        }
    }
}