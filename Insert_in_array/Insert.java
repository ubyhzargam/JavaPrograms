import java.util.Scanner;
class Insert
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array : ");
        int arr[]=new int[50];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ind;
        System.out.println("Enter the element you want to insert ");
        int x;
        x=sc.nextInt();
        System.out.println("Enter the position at which you want the element to be stored in the array ");
        ind=sc.nextInt();
        ind=Insert(arr,ind-1,x,50,n);
        if(ind==n)
        System.out.println("The array has exceeded it's maximum capacity");
        else
        {
        System.out.println("The element has been updated and the new array look like this - ");
        for(int i=0;i<ind;i++)
        {
            System.out.print(arr[i]+" ");
        }
        }
        System.out.println();
    }
    private static int Insert(int arr[],int ind, int x, int size,int n)
    {
        if(n==size)
        return n;
        else
        {
            for(int i=n-1;i>=ind;i--)
            {
                arr[i+1]=arr[i];
            }
            arr[ind]=x;
            return n+1;
        }
    }
}