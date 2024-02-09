import java.util.Scanner;
class Merge
{
    private static int []Merge(int arr1[],int arr2[])
    {
        int a=0,b=0;
        int arr[]=new int[arr1.length+arr2.length];
        int j=0;
        while(a<arr1.length&&b<arr2.length)
        {
            if(arr1[a]<=arr2[b])
            arr[j++]=arr1[a++];
            else
            arr[j++]=arr2[b++];
        }
        for(;a<arr1.length;a++)
        arr[j++]=arr1[a];
        for(;b<arr2.length;b++)
        arr[j++]=arr2[b];
        return arr;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in array1");
        n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter the elements in array1");
        for(int i=0;i<n;i++)
        arr1[i]=sc.nextInt();
        System.out.println("Enter the number of elements in array2");
        n=sc.nextInt();
        int arr2[]=new int[n];
        System.out.println("Enter the elements in array1");
        for(int i=0;i<n;i++)
        arr2[i]=sc.nextInt();
        System.out.println("The merged array of the entered sorted arrays is given by ");
        int arr[]=Merge(arr1,arr2);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}