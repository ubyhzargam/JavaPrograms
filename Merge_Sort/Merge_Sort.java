import java.util.Scanner;
class Merge_Sort
{
    
    private void Merge(int arr[],int low,int mid,int high)
    {
        int n1=mid-low+1;
        int n2=high-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++)
        arr1[i]=arr[low+i];
        for(int i=0;i<n2;i++)
        arr2[i]=arr[mid+i+1];
        int i=0,j=0,k=low;
        while(i<n1&&j<n2)
        {
            if(arr1[i]<=arr2[j])
            arr[k++]=arr1[i++];
            else
            arr[k++]=arr2[j++];
        }
        while(i<n1)
        arr[k++]=arr1[i++];
        while(j<n2)
        arr[k++]=arr2[j++];
    }
    
    private void MergeSort(int arr[],int l, int h)
    {
        if(l<h)
        {
            int mid=l+(h-l)/2;
            MergeSort(arr,l,mid);
            MergeSort(arr,mid+1,h);
            Merge(arr,l,mid,h);
        }
    }
    
    public static void main(String args[])
    {
        Merge_Sort m=new Merge_Sort();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        m.MergeSort(arr,0,n-1);
        System.out.println("The sorted array is given by ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}