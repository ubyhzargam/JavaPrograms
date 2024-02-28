import java.util.Scanner;
class Traverse
{
    private static void print(Node head)
    {
        if(head==null)return;
        Node curr=head;
        do
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the circular linked list : ");
        n=sc.nextInt();
        Node head=null;
        Node curr=null;
        System.out.println("Enter the elements in the linked list : ");
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
        if(head!=null)
        curr.next=head;
        System.out.println("The traversal of the circular linked list is ");
        print(head);
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