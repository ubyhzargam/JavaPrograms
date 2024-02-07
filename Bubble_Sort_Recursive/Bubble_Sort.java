import java.util.Scanner;
class Bubble_Sort
{
    void BubbleSort(int arr[],int n)
    {
        Bubble_Sort b=new Bubble_Sort();
        boolean swapped=false;
        if(n>=arr.length-1)
        return;
        for(int j=0;j<arr.length-n-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                b.swap(j,j+1,arr);
                swapped=true;
            }
        }
        if(!swapped)
        return;
        BubbleSort(arr,n+1);
    }
    void swap(int x,int y, int arr[])
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
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
        Bubble_Sort b=new Bubble_Sort();
        b.BubbleSort(arr,0);
        System.out.println("The sorted array is given by");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}