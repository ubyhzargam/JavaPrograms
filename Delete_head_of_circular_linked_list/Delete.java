import java.util.Scanner;
class Delete
{
    private static Node DeleteBeg(Node head)
    {
        if(head==null||head.next==head)return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the circular linked list");
        int n=sc.nextInt();
        System.out.println("Enter the elements of circular linked list");
        Node head=null,curr=null;
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            Node temp=new Node(ele);
            if(head==null)
            {
                head=curr=temp;
                continue;
            }
            curr.next=temp;
            curr=temp;
        }
        if(curr!=null)curr.next=head;
        System.out.println("The modified cicular linked list after deleting the first element is");
        head=DeleteBeg(head);
        curr=head;
        if(curr!=null)
        do
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        while(curr!=head);
        System.out.println();
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