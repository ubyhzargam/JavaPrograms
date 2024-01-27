import java.util.Scanner;
class EquilibriumIndex
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,5,5,5};
        int index=EquiIndex(arr);
        if(index==-1)
        System.out.println("There is no index i for which leftsum is equal to right sum");
        else
        System.out.println("The equilibrium index i is "+index);
    }
    
    private static int EquiIndex(int arr[])
    {
        int index=-1;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        sum+=arr[i];
        int leftsum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum-arr[i];
            leftsum+=arr[i];
            if(leftsum==sum)
            {
                index=i;
                break;
            }
        }
        return index;
    }
}