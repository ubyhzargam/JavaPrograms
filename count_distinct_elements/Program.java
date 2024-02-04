import java.util.*;
import java.util.HashSet;

class Program
{
    int CountDistinct(int arr[])
    {
        HashSet <Integer> h=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!h.contains(arr[i]))
            {
                h.add(arr[i]);
            }
        }
        return h.size();
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Program p=new Program();
        System.out.println("The number of distinct elements in the entered array are : "+ p.CountDistinct(arr));
    }
}