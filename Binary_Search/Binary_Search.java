import java.util.Scanner;
class Binary_Search
{
    int BS(int arr[],int key)
    {
        int low=0, high =arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)return mid;
            else if(arr[mid]>key)high=mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array in sorted order");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the key element to be searched in the array");
        int key=sc.nextInt();
        Binary_Search p=new Binary_Search();
        System.out.println("The index of the searched element in the array = "+p.BS(arr,key));
    }
}