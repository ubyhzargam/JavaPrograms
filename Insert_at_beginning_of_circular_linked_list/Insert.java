import java.util.Scanner;
class Insert
{
    private static Node Insert(Node head, int x)
    {
        Node temp=new Node(x);
        if(head==null)
        {
            temp.next=temp;
            head=temp;
            return temp;
        }
        Node curr=head;
        while(curr.next!=head)
        {
            curr=curr.next;
        }
        curr.next=temp;
        temp.next=head;
        head=temp;
        return head;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the circular linked list");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the circular linked list");
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
        System.out.println("Enter the element you want to insert at the beginning of circular linked list");
        int x=sc.nextInt();
        System.out.println("The modified linked list is given by ");
        head=Insert(head,x);
        curr=head;
        if(curr!=null)
        do
        {
        System.out.print(curr.data+" ");
        curr=curr.next;
        }while(curr!=head);
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