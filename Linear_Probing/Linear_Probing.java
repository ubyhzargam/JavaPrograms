class Linear_Probing
{
    int size,cap;
    int arr[];
    void Linear_Probing(int c)
    {
        cap=c;
        size=0;
        arr=new int[cap];
        for(int i=0;i<c;i++)
        arr[i]=-1;
    }
    
    int HashKey(int key)
    {
        return key%cap;
    }
    
    boolean Search(int key)
    {
        int h=HashKey(key);
        int i=h;
        while(arr[i]!=-1)
        {
            if(arr[i]==key)
            return true;
            i=(i+1)%cap;
            if(i==h)
            return false;
        }
        return false;
    }
    
    boolean Insert(int key)
    {
        if(size==cap)return false;
        int h=HashKey(key); int i=h;
        while(arr[i]!=-1&&arr[i]!=-2&&arr[i]!=key)
        {
            i=(i+1)%cap;
        }
        if(arr[i]==key)return false;
        else
        {
            arr[i]=key;
            size++;
            return true;
        }
    }
    
    boolean Delete(int key)
    {
        int h=HashKey(key);
        int i=h;
        while(arr[i]!=-1)
        {
            if(arr[i]==key)
            {
                arr[i]=-2;
                return true;
            }
            i=(i+1)%cap;
            if(i==h)
            return false;
        }
        return false;
    }
    
    public static void main(String []args)
    {
        Linear_Probing lp=new Linear_Probing();
        lp.Linear_Probing(7);
        lp.Insert(50);
        lp.Insert(51);
        lp.Insert(49);
        lp.Insert(16);
        lp.Insert(56);
        lp.Insert(15);
        lp.Insert(19);
        System.out.println(lp.Search(50));
        System.out.println(lp.Search(56));
        lp.Delete(56);
        System.out.println(lp.Search(56));
    }
}