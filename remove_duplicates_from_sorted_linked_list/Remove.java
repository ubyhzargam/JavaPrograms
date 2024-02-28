import java.util.Scanner;
class Remove
{
    private static void RemoveDups(Node head)
    {
        Node curr=head;
        while(curr!=null&&curr.next!=null)
        {
            if(curr.data==curr.next.data)
            {
            curr.next=curr.next.next;
            continue;
            }
            else
            curr=curr.next;
        }
    }
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the linked list");
        n=sc.nextInt();
        Node head=null;
        Node curr=null;
        System.out.println("Enter the linked list in sorted manner to remove all the duplicate elements from the linked list");
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
        RemoveDups(head);
        System.out.println("The modified linked list after removing duplicate elements is given by");
        curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
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