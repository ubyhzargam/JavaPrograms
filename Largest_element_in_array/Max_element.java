import java.util.Scanner;
class Max_element
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int i=0;
        i=MAX(arr);
        if(arr.length!=0)
        System.out.println("The maximum element in the array is present at index "+i+" and the value of the element is "+arr[i]);
        else
        System.out.println("There are no elements in the array");
    }
    private static int MAX(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int in=0;
        for(int i=0;i<arr.length;i++)
        if(arr[i]>max)
        {
            max=arr[i];
            in=i;
        }
        return in;
    }
}