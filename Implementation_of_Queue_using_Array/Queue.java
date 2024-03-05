class Queue
{
    int size,cap;
    int arr[];
    
    Queue(int x)
    {
        cap=x;
        size=0;
        arr=new int[cap];
    }
    
    void Enqueue(int x)
    {
        if(isFull())
        return;
        arr[size]=x;
        size++;
    }
    
    void Dequeue()
    {
        if(isEmpty())
        return;
        for(int i=0;i<size-1;i++)
        arr[i]=arr[i+1];
        size--;
    }
    
    boolean isEmpty()
    {
        return (size==0);
    }
    
    boolean isFull()
    {
        return (size==cap);
    }
    
    int getRear()
    {
        if(isEmpty())return -1;
        return size-1;
    }
    
    int getFront()
    {
        if(isEmpty())return -1;
        return 0;
    }
}