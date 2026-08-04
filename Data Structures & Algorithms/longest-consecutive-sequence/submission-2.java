class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        int ans=0;
        for(int it: nums)
        {
            set.add(it);
        }
        for(int i: set)
        {
            if(!set.contains(i-1))
            {int count=0, curr=i;
            while(set.contains(curr))
            {
                count++;
                curr++;
                
            }
            ans=Math.max(ans, count);}
        }
        return ans;
    }
}
