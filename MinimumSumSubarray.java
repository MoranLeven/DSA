public class MinimumSumSubarray {
    public static int[] findMinSumSubarray(int[] arr, int k) {
        int n = arr.length;
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;
        int start = 0;
        int finish = 0;
        int minStart = 0;
        while (finish < k) {
            currentSum += arr[finish];
            finish++;
        }
        minSum = currentSum;
        while (finish < n) {
            currentSum += arr[finish];
            currentSum -= arr[start];
            if (currentSum < minSum) {
                minSum = currentSum;
                minStart = start + 1;
            }
            start++;
            finish++;
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[minStart + i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 5, 6, 3, 8, 1};
        int k = 3;
        int[] result = findMinSumSubarray(arr, k);
        System.out.print("Minimum sum subarray of size " + k + " is: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
