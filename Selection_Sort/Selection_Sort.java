import java.util.Scanner;
class Selection_Sort
{
    private static void SelectionSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_index])min_index=j;
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        SelectionSort(arr);
        System.out.println("The sorted array is given by");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}