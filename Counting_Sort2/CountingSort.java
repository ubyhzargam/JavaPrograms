import java.util.Scanner;
class CountingSort
{
    private static void CSort(int arr[])
    {
        int k=arr.length;
        int n=arr.length;
        if(n==0||n==1)return;
        int h[]=new int[k];
        for(int i=0;i<k;i++)
        h[i]=0;
        for(int i=0;i<n;i++)
        h[arr[i]]++;
        for(int i=1;i<k;i++)
        h[i]=h[i-1]+h[i];
        int temp[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            temp[h[arr[i]]-1]=arr[i];
            h[arr[i]]--;
        }
        for(int i=0;i<n;i++)
        arr[i]=temp[i];
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        System.out.println("Enter the array elements which range from 0 to "+(n-1));
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("The sorted array is given by");
        CSort(arr);
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}