import java.util.*;
class MinDiffArr
{
    private static int MinDiff(int arr[])
    {
        int n=arr.length;
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        if(Math.abs(arr[i]-arr[i-1])<min)min=Math.abs(arr[i]-arr[i-1]);
        return min;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int diff=MinDiff(arr);
        System.out.println("The minimum difference in the entered array is = "+diff);
    }
}