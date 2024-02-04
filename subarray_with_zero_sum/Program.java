import java.util.*;
class Program
{
    boolean is0SumSub(int arr[])
    {
        int presum=0;
        HashSet <Integer> h=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            presum+=arr[i];
            if(h.contains(presum))
            return true;
            if(presum==0)
            return true;
            h.add(presum);
        }
        return false;
    }
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
        Program p=new Program();
        System.out.println("The array contains subarray with 0 sum : " + p.is0SumSub(arr));
    }
}