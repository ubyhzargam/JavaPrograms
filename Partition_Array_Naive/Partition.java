import java.util.Scanner;
class Partition
{
    private static void Bjp(int arr[],int low, int pivot, int high)
    {
        int n=high-low+1;
        int temp[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<pivot)
            temp[k++]=arr[i];
        }
        temp[k++]=pivot;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>pivot)
            temp[k++]=arr[i-low];
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
        System.out.println("Enter the elements of the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the pivot element");
        int ele=sc.nextInt();
        Bjp(arr,0,ele,n-1);
        System.out.println("The partitioned array is given by");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}