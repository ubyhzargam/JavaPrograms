import java.util.*;
class Union
{
    private static void UOSA(int arr1[],int arr2[])
    {
        int n=arr1.length,m=arr2.length;
        ArrayList<Integer> a=new ArrayList<Integer>();
        int i=0,j=0;
        while(i<n&&j<m)
        {
            if(arr1[i]<arr2[j])
            {
                if(a.contains(arr1[i]))
                {
                    i++;
                    continue;
                }
                else
                {
                    a.add(arr1[i++]);
                }
            }
            else
            {
                if(a.contains(arr2[j]))
                {
                    j++;
                    continue;
                }
                else
                {
                a.add(arr2[j++]);
                }
            }
        }
        while(i<n)
        {
            if(a.contains(arr1[i]))
            {
                i++;continue;
            }
            else
            a.add(arr1[i++]);
        }
        while(j<m)
        {
            if(a.contains(arr2[j]))
            {
                j++;continue;
            }
            else
            a.add(arr2[j++]);
        }
        System.out.println(a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter the elemnts of first array");
        for(int i=0;i<n;i++)
        arr1[i]=sc.nextInt();
        System.out.println("Enter the number of elements in the second array");
        n=sc.nextInt();
        int arr2[]=new int[n];
        System.out.println("Enter the elements of second array");
        for(int i=0;i<n;i++)
        arr2[i]=sc.nextInt();
        UOSA(arr1,arr2);
    }
}