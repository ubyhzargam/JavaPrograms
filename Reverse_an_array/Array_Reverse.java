import java.util.Scanner;
class Array_Reverse
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
        reverse(arr);
        if(n==0)
        System.out.println("There are no elements in the array ");
        else
        {
        System.out.println("The reversed array is given by :");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        }
    }
    
    private static void reverse(int arr[])
    {
        int low=0,high=arr.length-1;
        while(low<high)
        {
            int temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            low++;
            high--;
        }
    }
}