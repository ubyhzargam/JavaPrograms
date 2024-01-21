import java.util.Scanner;
class LeftRotate_d
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int d;
        System.out.println("Enter the times by which you want to left rotate the array");
        d=sc.nextInt();
        if(n==0)
        System.out.println("There are no elements in the array");
        else if(n==1)
        {
            System.out.println(arr[0]);
        }
        else
        {
            LeftRotated(arr,d);
            System.out.println("The updated array is this - ");
            for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
    
    private static void LeftRotated(int arr[],int d)
    {
        Reverse(arr,0,d-1);
        Reverse(arr,d,arr.length-1);
        Reverse(arr,0,arr.length-1);
    }
    
    private static void Reverse(int arr[], int low, int high)
    {
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            high--;
            low++;
        }
    }
}