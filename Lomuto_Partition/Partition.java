import java.util.Scanner;
class Partition
{
    private static void LomutoPartition(int arr[],int low,int high)
    {
        int key=arr[high];
        int i=low-1;
        int j=low;
        for(;j<high;j++)
        {
            if(arr[j]<key)
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        arr[i+1]=key;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the index of the pivot element about which you want the partition");
        int i=sc.nextInt();
        int temp=arr[i];
        arr[i]=arr[n-1];
        arr[n-1]=temp;
        LomutoPartition(arr,0,n-1);
        System.out.println("The updated array is given by ");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}