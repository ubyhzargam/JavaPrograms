import java.util.Scanner;
class LeftRotate_d
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array");
        int arr[]=new int[n];
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
        int n=arr.length;
        int temp[]=new int[d];
        for(int i=0;i<d;i++)
        temp[i]=arr[i];
        for(int i=d;i<n;i++)
        arr[i-d]=arr[i];
        for(int i=0;i<d;i++)
        arr[n-d+i]=temp[i];
    }
}
