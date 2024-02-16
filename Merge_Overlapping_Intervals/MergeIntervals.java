import java.util.*;

class MergeIntervals
{
    private static void MI(Interval arr[])
    {
        if(arr.length==0||arr.length==1)return;
        Arrays.sort(arr,Comparator.comparingInt(a->a.start));
        int res=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[res].end>=arr[i].start)
            {
                arr[res].start=Math.min(arr[res].start,arr[i].start);
                arr[res].end=Math.max(arr[res].end,arr[i].end);
            }
            else
            {
                res++;
                arr[res]=arr[i];
            }
        }
        for(int i=0;i<=res;i++)
        System.out.println(arr[i].start+" "+arr[i].end);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the Interval array");
        int n=sc.nextInt();
        Interval arr[]=new Interval[n];
        System.out.println("Enter the starting and ending intervals of each of the interval element array");
        for(int i=0;i<n;i++)
        {
            arr[i]=new Interval();
            arr[i].start=sc.nextInt();
            arr[i].end=sc.nextInt();
        }
        System.out.println("The array obtained after merging the overlapping intervals in given by");
        MI(arr);
    }
}

class Interval
{
    int end;
    int start;
    Interval()
    {
        start=0;
        end=0;
    }
}