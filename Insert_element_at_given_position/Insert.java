import java.util.Scanner;
class Insert
{
    private static Node Insertat(Node head, int x,int pos)
    {
        if(pos==1)
        {
            Node temp=new Node(x);
            temp.next=head;
            return temp;
        }
        int c=1;
        Node curr=head;
        while(c<pos&&curr!=null)
        {
            c++;
            curr=curr.next;
        }
        if(curr==null)return head;
        Node temp=new Node(x);
        temp.next=curr.next;
        curr.next=temp;
        return head;
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
        System.out.println("Enter the element you want to Insert");
        int ele=sc.nextInt();
        System.out.println("Enter the position at which you want to insert the element");
        int pos=sc.nextInt();
        head=Insertat(head,ele,pos);
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