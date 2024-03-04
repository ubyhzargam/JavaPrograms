class Stack
{
    public static void main(String []args)
    {
        MyStack s=new MyStack(10);
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

class MyStack
{
    int cap;
    int size;
    int top;
    int arr[];
    MyStack(int x)
    {
        cap=x;
        top=-1;
        size=0;
        arr=new int[cap];
    }
    void Push(int x)
    {
        if(size>cap)
        return;
        size++;
        top++;
        arr[top]=x;
    }
    int Pop()
    {
        if(top<0)
        return -1;
        size--;
        return arr[top--];
    }
    boolean isEmpty()
    {
        return (top==-1);
    }
    int Peek()
    {
        if(top<0)
        return -1;
        return arr[top];
    }
    int Size()
    {
        return size;
    }
}