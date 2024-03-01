 import java.util.Scanner;
class Reverse
{
    private static Node Reverse(Node head)
    {
        if(head==null||head.next==null)return head;
        Node next=head;
        while(next!=null)
        {
           Node temp1=next.prev;
           next.prev=next.next;
           next.next=temp1;
           if(next.prev==null)
           head=next;
           next=next.prev;
        }
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
        head=Reverse(head);
        System.out.println("The modified doubly linked list after reversing is given by");
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