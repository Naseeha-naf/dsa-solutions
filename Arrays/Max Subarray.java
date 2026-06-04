class Solution {
    public double findMaxAverage(int[] nums, int k) {

        // sum of first window
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        //  slide the window
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        //  return answer
        return maxSum / k;
    }
}
