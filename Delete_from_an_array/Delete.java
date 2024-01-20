import java.util.Scanner;
class Delete
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
        int x;
        System.out.println("Enter the element you want to delete from the array : ");
        x=sc.nextInt();
        x=Delete(arr,x);
        if(n==x)
        System.out.println("The element to be deleted was not found in the entered array ");
        else
        System.out.println("The elements was found in the entered array and it has been deleted ");
        System.out.println("The updated array look like this ");
        for(int i=0;i<x;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();
    }
    private static int Delete(int arr[],int x)
    {
        int i=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                break;
            }
        }
        if(i==arr.length)
        return arr.length;
        else
        {
            for(int j=i;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            return arr.length-1;
        }
    }
    }