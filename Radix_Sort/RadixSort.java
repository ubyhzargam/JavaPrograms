import java.util.Scanner;
class RadixSort
{
    private static void RSort(int arr[])
    {
        if(arr.length==0||arr.length==1)
        return;
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        if(arr[i]>max)
        max=arr[i];
        for(int exp=1;max/exp>0;exp=exp*10)
        CountingSort(arr,exp);
    }
    private static void CountingSort(int arr[],int exp)
    {
        int h[]=new int[10];
        int temp[]=new int[arr.length];
        for(int i=0;i<10;i++)
        h[i]=0;
        for(int i=0;i<arr.length;i++)
        h[(arr[i]/exp)%10]++;
        for(int i=1;i<10;i++)
        h[i]=h[i]+h[i-1];
        for(int i=(arr.length-1);i>=0;i--)
        {
        temp[h[(arr[i]/exp)%10]-1]=arr[i];
        h[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<arr.length;i++)
        arr[i]=temp[i];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        RSort(arr);
        System.out.println("The sorted array is given by ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}
