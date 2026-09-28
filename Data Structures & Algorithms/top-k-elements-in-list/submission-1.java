class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> freq[] = new ArrayList[nums.length + 1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= nums.length; i++) {
            if (i < nums.length)
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            freq[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            freq[it.getValue()].add(it.getKey());
        }
        int ans[] = new int[k];
        int ind = 0;
        for (int i = nums.length; i >= 0 && ind < k; i--) {
            for (int n : freq[i]) {
                ans[ind++] = n;

                if (ind == k)
                    return ans;
            }
        }
        return ans;
    }
}
