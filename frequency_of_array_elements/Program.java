import java.util.*;
class Program
{
    void FreqEle(int arr[])
    {
        HashMap <Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!h.containsKey(arr[i]))
            {
                h.put(arr[i],1);
            }
            else
            {
                h.put(arr[i],h.get(arr[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> e : h.entrySet())
        System.out.println(e.getKey()+" "+e.getValue());
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
        p.FreqEle(arr);
    }
}