import java.util.Scanner;
class kth
{
    private static int LomutoPartition(int arr[],int l,int r)
    {
        int pivot=arr[r];
        int index=l-1;
        for(int j=l;j<r;j++)
        {
            if(arr[j]<pivot)
            {
                index++;
                int temp=arr[index];
                arr[index]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[index+1];
        arr[index+1]=arr[r];
        arr[r]=temp;
        return (index+1);
    }
    private int kthsmallest(int arr[],int k)
    {
        int r=arr.length-1;
        int l=0;
        while(l<=r)
        {
            int p=LomutoPartition(arr,l,r);
            if(p==k-1)
            return p;
            else if(p<k-1)
            l=p+1;
            else
            r=p-1;
        }
        return -1;
    }
    public static void main(String []args)
    {
        kth kt=new kth();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int k;
        System.out.println("Enter k which will find the kth smallest element in the array");
        k=sc.nextInt();
        int ans=kt.kthsmallest(arr,k);
        if(k>n)
        System.out.println("There are not so many elements in the array");
        else
        System.out.println("The "+k+"th smallest element in the entered array is given by "+arr[ans]);
    }
}