import java.util.Scanner;
class Inversions
{
    private int CountInv(int arr[],int l, int r)
    {
        int res=0;
        if(l<r)
        {
            int m=l+(r-l)/2;
            res+=CountInv(arr,l,m);
            res+=CountInv(arr,m+1,r);
            res+=CountandMerge(arr,l,m,r);
        }
        return res;
    }
    private int CountandMerge(int arr[],int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
        left[i]=arr[l+i];
        for(int i=0;i<n2;i++)
        right[i]=arr[m+i+1];
        int i=0,j=0,k=0;
        int res=0;
        while(i<n1&&j<n2)
        {
            if(left[i]<=right[j])
            {
                arr[l+k]=left[i++];
                k++;
            }
            else
            {
                arr[l+k]=right[j++];
                k++;
                res=res+(n1-i);
            }
        }
        while(i<n1)
        {
            arr[l+k]=left[i++];
            k++;
        }
        while(j<n2)
        {
            arr[l+k]=right[j++];
            k++;
        }
        return res;
    }
    public static void main(String []args)
    {
        Inversions i=new Inversions();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int c=0;c<n;c++)
        arr[c]=sc.nextInt();
        int res=i.CountInv(arr,0,n-1);
        System.out.println("The number of inversions in the entered array are "+res);
    }
}