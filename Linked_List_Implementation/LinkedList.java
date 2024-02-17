import java.util.Scanner;
class LinkedList
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store in linked list");
        int n=sc.nextInt();
        Node head=null;
        System.out.println("Enter the elements in the linked list");
        Node temp1=null;
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            Node temp2=new Node(ele);
            if(head==null)
            {
            head=temp1=temp2;
            }
            else
            {
            temp1.next=temp2;
            temp1=temp2;
            }
        }
        temp1=head;
        System.out.println("The linked list elements are given by");
        while(temp1!=null)
        {
            System.out.print(temp1.data+" ");
            temp1=temp1.next;
        }
    }
}
class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}