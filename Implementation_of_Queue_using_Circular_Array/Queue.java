class Queue
{
    int cap,size,front;
    int arr[];
    Queue(int x)
    {
        cap=x;
        size=front=0;
        arr=new int[cap];
    }
    
    void Enqueue(int x)
    {
        if(isFull())return;
        int rear=(getRear()+1)%cap;
        arr[rear]=x;
        size++;
    }
    
    void Dequeue()
    {
        if(isEmpty())return;
        front=(front+1)%cap;
        size--;
    }
    
    boolean isFull()
    {
        return (size==cap);
    }
    
    boolean isEmpty()
    {
        return (size==0);
    }
    
    int getRear()
    {
        if(isEmpty())return -1;
        return size-1;
    }
}