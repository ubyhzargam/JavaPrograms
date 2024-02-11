import java.util.Scanner;
class QuickSort
{
    private static int HPartition(int arr[],int l,int h)
    {
        int key=arr[l];
        int i=l-1,j=h+1;
        while(true)
        {
            do
            {
                i++;
            }while(arr[i]<key);
            do
            {
                j--;
            }while(arr[j]>key);
            if(i>=j)return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    private static void qSort(int arr[],int l,int h)
    {
        if(l<h)
        {
            int p=HPartition(arr,l,h);
            qSort(arr,l,p);
            qSort(arr,p+1,h);
        }
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
        qSort(arr,0,n-1);
        System.out.println("The sorted array is given by");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}