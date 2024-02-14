import java.util.*;
class BucketSort
{
    private static void BucketSort(int arr[],int k)
    {
        if(arr.length==0||arr.length==1)
        return;
        int max=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++)
        max=Math.max(max,arr[i]);
        max++;
        ArrayList<ArrayList<Integer>> bkt=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<k;i++)
        bkt.add(new ArrayList<Integer>());
        for(int i=0;i<n;i++)
        {
            int bi=(k*arr[i])/max;
            bkt.get(bi).add(arr[i]);
        }
        for(int i=0;i<k;i++)
        Collections.sort(bkt.get(i));
        int index=0;
        for(int i=0;i<k;i++)
        for(int j=0;j<bkt.get(i).size();j++)
        arr[index++]=bkt.get(i).get(j);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the number of buckets to be used in the bucket sort algorithm, number of buckets >0");
        int k=sc.nextInt();
        BucketSort(arr,k);
        System.out.println("The sorted array is given by");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}