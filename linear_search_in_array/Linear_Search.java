import java.util.Scanner;
class Linear_Search
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s;
        System.out.println("Enter the element to be searched in the Array : ");
        s=sc.nextInt();
        n=LS(arr,s);
        if(n==-1)
        System.out.println("The element was not found in the entered array ");
        else
        System.out.println("The element was found in the entered array and was found at index " +n);
    }
    private static int LS(int arr[],int s)
    {
        int n=arr.length;
        int i=-1;
        for(int j=0;j<n;j++)
        if(arr[j]==s)
        {
        i=j;
        break;
        }
        return i;
    }
}