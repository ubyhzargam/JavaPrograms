import java.util.Arrays;
import java.util.Scanner;
class Max_array_Stream
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array ");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int max=Arrays.stream(arr)
                .max()
                .getAsInt();
        System.out.println("The maximum of all the elements in the entered array is : "+max);
    }
}