import java.util.Arrays;
import java.util.Scanner;
class Sum_of_Array_using_Stream
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements to be entered in the array ");
        n=sc.nextInt();
        System.out.println("Enter the array elements to find their sum");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int sum=Arrays.stream(arr)
                .sum();
        System.out.println("The sum of the elements in the array is : "+sum);      
    }
}