import java.util.Scanner;
class Reverse
{
    private Node reverse(Node curr, Node prev)
    {
        if(curr==null)
        return prev;
        Node next=curr.next;
        curr.next=prev;
        return reverse(next,curr);
    }
     public static void main(String []args)
    {
        Reverse r=new Reverse();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the linked list");
        n=sc.nextInt();
        Node head=null;
        Node temp1=null;
        int ele=0;
        System.out.println("Enter the elements in the linked list");
        for(int i=0;i<n;i++)
        {
            ele=sc.nextInt();
            Node temp2=new Node(ele);
            if(head==null)
            {
                temp1=head=temp2;
                continue;
            }
            temp1.next=temp2;
            temp1=temp2;
        }
        System.out.println("The reversed linked list is given by ");
        head=r.reverse(head,null);
        Node curr=head;
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