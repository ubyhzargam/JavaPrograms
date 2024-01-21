import java.util.Scanner;
class MoveZeros
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
        if(n==0)
        System.out.println("There are no elements in the array");
        else if(n==1)
        System.out.println(arr[0]);
        else
        {
        MoveZeros(arr);
        System.out.println("The new array looks like this ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        }
        
    }
    
    private static void MoveZeros(int arr[])
    {
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}