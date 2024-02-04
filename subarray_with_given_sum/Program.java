import java.util.*;
class Program
{
    boolean SumSub(int arr[], int sum)
    {
        int presum=0;
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            presum+=arr[i];
            if(presum==sum)return true;
            if(h.contains(presum-sum))return true;
            h.add(presum);
        }
        return false;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the value of sum you want the array to have a subarray of");
        int sum=sc.nextInt();
        Program p=new Program();
        System.out.println("The entered array contains a subarray of entered sum :"+p.SumSub(arr,sum));
    }
}