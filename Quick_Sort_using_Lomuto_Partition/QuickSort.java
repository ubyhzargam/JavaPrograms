import java.util.Scanner;
class QuickSort
{
    private static int LPartition(int arr[],int l,int h)
    {
        int key=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++)
        {
            if(arr[j]<key)
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
    private void qSort(int arr[],int l,int h)
    {
        if(l<h)
        {
            int p=LPartition(arr,l,h);
            qSort(arr,l,p-1);
            qSort(arr,p+1,h);
        }
    }
    public static void main(String args[])
    {
        QuickSort q=new QuickSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        q.qSort(arr,0,n-1);
        System.out.println("The sorted array is given by");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}