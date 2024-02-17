import java.util.Scanner;
class Search
{
    private static int RecurSearch(Node head, int x,int i)
    {
        if(head==null)
        return -1;
        else
        {
            if(head.data==x)
            return i+1;
            return RecurSearch(head.next,x,i+1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the linked list");
        n=sc.nextInt();
        Node head=null;
        Node temp1=null;
        System.out.println("Enter the elements of linked list");
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
        System.out.println("Enter the element you want to search for");
        int x=sc.nextInt();
        int pos=RecurSearch(head,x,0);
        if(pos==-1)
        System.out.println("The element is not present in the array");
        else
        System.out.println("The element is present at position "+pos);
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