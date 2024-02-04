import java.util.*;

class Program {
    int MaxSumSub(int arr[], int sum) {
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
        System.out.println("Enter the value of sum you want the array to have a subarray of");
        int sum = sc.nextInt();
        Program p = new Program();
        System.out.println("The maximum length of subarray with entered sum in the given array = " + p.MaxSumSub(arr, sum));
    }
}
