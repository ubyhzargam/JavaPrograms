import java.util.*;

class Program {
    int MaxSumSub(int arr[], int sum) 
    {
        for(int i=0;i<arr.length;i++)
        if(arr[i]==0)arr[i]=-1;
        int res = 0;
        int presum = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            presum += arr[i];

            if (presum == sum) {
                res = i + 1;
            }

            if (!m.containsKey(presum)) {
                m.put(presum, i);
            }

            if (m.containsKey(presum - sum)) {
                res = Math.max(res, i - m.get(presum - sum));
            }
        }

        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Program p = new Program();
        System.out.println("The maximum length of subarray having equal number of zeros and ones is = " + p.MaxSumSub(arr, 0));
    }
}
