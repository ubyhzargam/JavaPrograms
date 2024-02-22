import java.util.Scanner;
class Insert
{
    private static Node InsertEle(Node head, int x)
    {
        Node temp=new Node(x);
        if(head==null)return temp;
        if(x<head.data)
        {
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while(curr.next!=null&&curr.next.data<=x)
        {
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list");
        int n=sc.nextInt();
        System.out.println("Enter the sorted linked list");
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
        System.out.println("Enter the element you want to insert in the sorted linked list");
        int x=sc.nextInt();
        head=InsertEle(head,x);
        System.out.println("The modified linked list after inserting the entered element is ");
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