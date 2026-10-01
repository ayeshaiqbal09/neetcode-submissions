class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int n : nums) {
            sum += n;
            max = max < sum ? sum : max;
            sum = sum < 0 ? 0 : sum;
        }
        return max;
    }
}
