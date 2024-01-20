import java.util.Scanner;
class Array
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int ind=SL(arr);
        if (ind==-1)
        System.out.println("There is no second larget element in the array");
        else
        System.out.println("The second largest element in the array is "+arr[ind]+" and it is present at index "+ind);
        
    }
    
    private static int SL(int arr[])
    {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        int ind1=-1,ind2=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(max1<arr[i])
            {
                max2=max1;
                max1=arr[i];
                ind2=ind1;
                ind1=i;
            }
            else if(max1>arr[i])
            {
                if(max2==Integer.MIN_VALUE||max2<arr[i])
                {
                    max2=arr[i];
                    ind2=i;
                }
            }
        }
        return ind2;
    }
}