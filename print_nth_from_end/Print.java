import java.util.Scanner;
class Print
{
    private static void printNthfromEnd(Node head, int n)
    {
        if(head==null)return;
        Node first=head;
        for(int i=0;i<n;i++)
        {
            if(first==null)return;
            first=first.next;
        }
        Node second=head;
        while(first!=null)
        {
            second=second.next;
            first=first.next;
        }
        System.out.println("The "+n+" th element from the end of linked list is "+second.data);
    }
    public static void main(String []args)
    {
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
            }
            temp1.next=temp2;
            temp1=temp2;
        }
        System.out.println("Enter the value of n to print the nth element from the end");
        n=sc.nextInt();
        printNthfromEnd(head,n);
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