import java.util.Scanner;
class Insert
{
    private static Node Insertatbeg(Node head, int x)
    {
        Node temp=new Node(x);
        temp.next=head;
        return temp;
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
        System.out.println("Enter the element you want to enter at the beginning");
        int ele=sc.nextInt();
        head=Insertatbeg(head,ele);
        System.out.println("The modified linked list is given by");
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