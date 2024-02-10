import java.util.Scanner;
class Partition
{
    private static void HoarePartition(int arr[],int low,int high)
    {
        int key=arr[low];
        int i=low-1;
        int j=high+1;
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
            if(i>=j)return;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the index about which you want the partition to happen");
        int i=sc.nextInt();
        int temp=arr[0];
        arr[0]=arr[i];
        arr[i]=temp;
        HoarePartition(arr,0,n-1);
        System.out.println("The modified array is given by");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}