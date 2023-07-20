public class MaxSubarraySum {
    public static int maxSubarraySum(int[] arr) {
        int maxSum = arr[0]; // Initialize the maximum sum with the first element of the array
        int currentSum = arr[0]; // Initialize the current sum with the first element

        for (int i = 1; i < arr.length; i++) {
            // Check if adding the current element to the current sum is greater than the
            // current element alone
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            // Update the maximum sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // public static void main(String[] args) {
    // int[] arr1 = { 1, 2, 3, 4, 5 };
    // System.out.println(maxSubarraySum(arr1)); // Output: 15 (The subarray [1, 2,
    // 3, 4, 5] has the maximum sum)

    // int[] arr2 = { -1, -2, -3, -4, -5 };
    // System.out.println(maxSubarraySum(arr2)); // Output: -1 (The subarray [-1]
    // has the maximum sum)

    // int[] arr3 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    // System.out.println(maxSubarraySum(arr3)); // Output: 6 (The subarray [4, -1,
    // 2, 1] has the maximum sum)

    // int[] arr4 = { 0, 0, 0, 0, 0 };
    // System.out.println(maxSubarraySum(arr4)); // Output: 0 (The subarray [0] has
    // the maximum sum)

    // int[] arr5 = { 5 };
    // System.out.println(maxSubarraySum(arr5)); // Output: 5 (The subarray [5] has
    // the maximum sum)

    // int[] arr6 = { -5, -2, -8, -10 };
    // System.out.println(maxSubarraySum(arr6)); // Output: -2 (The subarray [-2]
    // has the maximum sum)

    // int[] arr7 = { 10, 20, 30, 40, 50 };
    // System.out.println(maxSubarraySum(arr7)); // Output: 150 (The subarray [10,
    // 20, 30, 40, 50] has the maximum sum)

    // int[] arr8 = { 4, -1, 2, 1, -5, 3, 0, -1, 6 };
    // System.out.println(maxSubarraySum(arr8)); // Output: 10 (The subarray [4, -1,
    // 2, 1] has the maximum sum)
    // }
}
