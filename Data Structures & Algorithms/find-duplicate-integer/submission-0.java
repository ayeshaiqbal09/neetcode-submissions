class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int it:nums)
        {
            if(!set.add(it))return it;
        }
        return -1;
    }
}
