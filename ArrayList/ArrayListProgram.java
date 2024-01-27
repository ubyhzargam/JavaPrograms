import java.util.*;
import java.io.*;
class ArrayListProgram
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the arraylist");
        n=sc.nextInt();
        ArrayList<Integer> arrLi=new ArrayList<Integer>(n);
        System.out.println("Enter the elements in the arraylist");
        int x=0;
        for(int i=0;i<n;i++)
        {
            x=sc.nextInt();
            arrLi.add(x);
        }
        System.out.println("The entered Array list is " + arrLi);
    }
}