import java.util.Scanner;
class Delete
{
    private static Node Deleteatbeg(Node head)
    {
        if(head==null||head.next==null)return null;
        return head.next;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list");
        int n=sc.nextInt();
        Node head=null;
        Node temp1=null;
        System.out.println("Enter the elements in the linked list");
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            Node temp2=new Node(ele);
            if(head==null)
            {
                head=temp1=temp2;
                continue;
            }
            temp1.next=temp2;
            temp1=temp2;
        }
        head=Deleteatbeg(head);
        System.out.println("The modified linked list after deletion at beginning is given by");
        temp1=head;
        while(temp1!=null)
        {
            System.out.print(temp1.data+" ");
            temp1=temp1.next;
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