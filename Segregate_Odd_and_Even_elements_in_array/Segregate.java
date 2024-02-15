import java.util.Scanner;
class Segregate
{
    private static void SegPosNeg(int arr[])
    {
        if(arr.length==1||arr.length==0)return;
        int n=arr.length;
        int i=0,j=0;
        while(i<n-1&&j<n-1)
        {
            while((arr[i])%2==0&&i<n-1)
            i++;
            while((arr[j])%2!=0&&j<n-1)
            j++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        SegPosNeg(arr);
        System.out.println("The modified array is given by");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}