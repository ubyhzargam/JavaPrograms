import java.util.*;
class HashMap
{
    public static void main(String []args)
    {
        HashMap h=new HashMap();
        h.HashMap(7);
        h.Insert(50);
        h.Insert(21);
        h.Insert(58);
        h.Insert(17);
        h.Insert(15);
        h.Insert(49);
        h.Insert(56);
        h.Insert(22);
        h.Insert(23);
        h.Insert(21);
        System.out.println(h.Search(21));
        System.out.println(h.Search(56));
        h.Delete(56);
        System.out.println(h.Search(56));
    }
    int Bucket;
    ArrayList<LinkedList<Integer>> table;
    private void HashMap(int b)
    {
        Bucket=b;
        table=new ArrayList<LinkedList<Integer>>();
        for(int i=0;i<b;i++)
        table.add(new LinkedList<Integer>());
    }
    private void Insert(int key)
    {
        int i=key%Bucket;
        table.get(i).add(key);
    }
    private void Delete(int key)
    {
        int i=key%Bucket;
        table.get(i).remove((Integer)key);
    }
    private boolean Search(int key)
    {
        int i=key%Bucket;
        return table.get(i).contains(key);
    }
}