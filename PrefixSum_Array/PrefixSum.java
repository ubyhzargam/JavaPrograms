import java.util.Scanner;
class PrefixSum
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        int prefixsumarr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        if(i==0)
        prefixsumarr[i]=arr[i];
        else
        prefixsumarr[i]=arr[i]+prefixsumarr[i-1];
        }
        System.out.println("The prefixsum array is given by :");
        for(int i=0;i<n;i++)
        System.out.print(prefixsumarr[i]+" ");
        System.out.println();
        
    }
}