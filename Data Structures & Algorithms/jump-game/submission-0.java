class Solution {
    public boolean canJump(int[] nums) {
        int goal=nums.length-1;
        int i=goal-1;
        while(i>=0)
        {
            if(i+nums[i]>=goal)goal=i;

            i--;
        }
       return goal==0;
    }
}
