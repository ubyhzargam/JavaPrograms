import java.util.Scanner;
class Middle
{
    private static void MiddleEle(Node head)
    {
        if(head==null)
        return;
        Node curr1=head,curr2=head;
        while(curr2!=null&&curr2.next!=null)
        {
            curr1=curr1.next;
            curr2=curr2.next.next;
        }
        System.out.println("The middle element of the entered linked list is "+curr1.data);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list");
        int n=sc.nextInt();
        System.out.println("Enter the elements of linked list");
        Node head=null,curr=null;
        for(int i=0;i<n;i++)
        {
            int temp=sc.nextInt();
            if(head==null)
            {
                head=new Node(temp);
                curr=head;
                continue;
            }
            else
            {
                Node curr2=new Node(temp);
                curr.next=curr2;
                curr=curr2;
            }
        }
        MiddleEle(head);
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