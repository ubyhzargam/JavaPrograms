import java.util.Scanner;
class LeftRotate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        if(n==0)
        System.out.println("There are no elements in the array");
        else if(n==1)
        System.out.println(arr[0]);
        else
        {
            LeftRotate(arr);
            System.out.println("The array left rotated by 1 is given by :");
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    
    private static void LeftRotate(int arr[])
    {
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++)
        arr[i-1]=arr[i];
        arr[n-1]=temp;
    }
}