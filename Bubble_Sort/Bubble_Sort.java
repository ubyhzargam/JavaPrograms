import java.util.Scanner;
class Bubble_Sort
{
    private static void BubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            boolean swapped=false;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
            {
                break;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("The array in sorted order is given by");
        BubbleSort(arr);
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}