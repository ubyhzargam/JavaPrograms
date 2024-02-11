import java.util.Scanner;
class CountingSort
{
    private static void CSort(int arr[])
    {
        if(arr.length==0||arr.length==1)return;
        int k=arr.length-1;
        int n=arr.length;
        int h[]=new int[k];
        for(int i=0;i<k;i++)
        h[i]=0;
        for(int i=0;i<n;i++)
        h[arr[i]]++;
        int index=0;
        for(int i=0;i<k;i++)
        {
            for(int j=h[i];j>0;j--)
            {
                arr[index++]=i;
            }
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        System.out.println("Enter the array elements, the array elements should be in the range of 0 to "+(n-1));
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        CSort(arr);
        System.out.println("The sorted array is given by");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}