import java.util.Scanner;
class Insert
{
    private static Node InsertBeg(Node head, int x)
    {
        Node temp=new Node(x);
        if(head==null)
        return temp;
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        
        curr.next=temp;
        temp.prev=curr;
        return head;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the doubly linked list");
        n=sc.nextInt();
        System.out.println("Enter the elements in the doubly linked list");
        Node head=null, curr=null;
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            Node temp=new Node(ele);
            if(head==null)
            {
                head=curr=temp;
                continue;
            }
            temp.prev=curr;
            curr.next=temp;
            curr=temp;
        }
        System.out.println("Enter the element you want to insert at the end of the doubly linked list");
        int x=sc.nextInt();
        head=InsertBeg(head,x);
        System.out.println("The modified doubly linked list after inserting element at the end is given by");
        curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}
class Node
{
    int data;
    Node prev;
    Node next;
    Node(int x)
    {
        data=x;
        prev=next=null;
    }
}