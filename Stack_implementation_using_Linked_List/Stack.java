class Stack
{
    public static void main(String []args)
    {
        MyStack s=new MyStack();
        s.Push(1);
        s.Push(2);
        System.out.println(s.Peek());
        System.out.println(s.Size());
        s.Push(3);
        System.out.println(s.Pop());
        System.out.println(s.Pop());
        System.out.println(s.Pop());
        System.out.println(s.Pop());
        System.out.println(s.isEmpty());
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

class MyStack
{
    Node head;
    int size;
    MyStack()
    {
        head=null;
        size=0;
    }
    
    void Push(int data)
    {
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        size++;
    }
    
    int Pop()
    {
        if(head==null)
        return Integer.MIN_VALUE;
        size--;
        int data=head.data;
        head=head.next;
        return data;
    }
    
    int Peek()
    {
        if(head==null)
        return Integer.MIN_VALUE;
        return head.data;
    }
    
    boolean isEmpty()
    {
        return (head==null);
    }
    
    int Size()
    {
        return size;
    }
}