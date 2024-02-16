import java.util.*;
class Meeting
{
    private static int meetmaxgue(int arr[],int dep[])
    {
        if(arr.length==0)return 0;
        if(arr.length==1)return 1;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0,res=1,curr=1;
        while(i<arr.length&&j<arr.length)
        {
            if(arr[i]<=dep[j])
            {
                i++;
                curr++;
            }
            else
            {
                j++;
                curr--;
            }
            res=Math.max(res,curr);
        }
        return res;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of guests/ number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int dep[]=new int[n];
        System.out.println("Enter the arrival time of guests in the array which range from 0 to 2359");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the departure time of guests in the array which range from 0 to 2359");
        for(int i=0;i<n;i++)
        dep[i]=sc.nextInt();
        int res=meetmaxgue(arr,dep);
        System.out.println("The maximum guests you can meet are "+res);
    }
}