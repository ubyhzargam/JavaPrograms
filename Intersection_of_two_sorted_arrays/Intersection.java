import java.util.Scanner;
class Intersection
{
    private static void IOSA(int arr1[],int arr2[])
    {
        int n=arr1.length,m=arr2.length;
        int arr[]=new int[Math.min(m,n)];
        int i=0,j=0,k=0;
        while(i<n&&j<m)
        {
            if(arr1[i]<arr2[j])
            i++;
            else if(arr1[i]>arr2[j])
            j++;
            else if(arr1[i]==arr2[j])
            {
                if(k==0)
                {
                arr[k++]=arr1[i++];
                }
                else if(arr[k-1]==arr1[i])
                {
                    i++;
                }
                else
                {
                    arr[k++]=arr1[i++];
                }
                j++;
            }
        }
        System.out.println("The intersection of the two arrays is given by");
        if(k==0)
        System.out.println("There are no elements in the intersection of entered arrays");
        else
        {
        for(int c=0;c<k;c++)
        System.out.print(arr[c]+" ");
        System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the first array");
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        arr1[i]=sc.nextInt();
        System.out.println("Enter the number of elements in the second array");
        n=sc.nextInt();
        System.out.println("Enter the elements in the first array");
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        arr2[i]=sc.nextInt();
        IOSA(arr1,arr2);
    }
}