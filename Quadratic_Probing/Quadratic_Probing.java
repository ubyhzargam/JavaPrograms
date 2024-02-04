class Quadratic_Probing {
    int size, cap;
    int arr[];

    void Quadratic_Probing(int c) {
        cap = c;
        size = 0;
        arr = new int[cap];
        for (int i = 0; i < c; i++)
            arr[i] = -1;
    }

    int HashKey(int key) {
        return key % cap;
    }

    boolean Search(int key) {
        int h = HashKey(key);
        int i = h;
        int count = 0;
        while (arr[i] != -1 && count < cap) {
            if (arr[i] == key)
                return true;
            count++;
            i = (i + count * count) % cap;
        }
        return false;
    }

    boolean Insert(int key) {
        if (size == cap)
            return false;
        int h = HashKey(key);
        int i = h;
        int count = 0;
        while (arr[i] != -1 && arr[i] != -2 && arr[i] != key && count < cap) {
            count++;
            i = (i + count * count) % cap;
        }
        if (arr[i] == key)
            return false;
        else {
            arr[i] = key;
            size++;
            return true;
        }
    }

    boolean Delete(int key) {
        int h = HashKey(key);
        int i = h;
        int count = 0;
        while (arr[i] != -1 && count < cap) {
            if (arr[i] == key) {
                arr[i] = -2;
                size--;
                return true;
            }
            count++;
            i = (i + count * count) % cap;
        }
        return false;
    }

    public static void main(String[] args) {
        Quadratic_Probing qp = new Quadratic_Probing();
        qp.Quadratic_Probing(7);
        qp.Insert(50);
        qp.Insert(51);
        qp.Insert(49);
        qp.Insert(16);
        qp.Insert(56);
        qp.Insert(15);
        qp.Insert(19);
        System.out.println(qp.Search(50));
        System.out.println(qp.Search(56));
        qp.Delete(56);
        System.out.println(qp.Search(56));
    }
}
