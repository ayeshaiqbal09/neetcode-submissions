class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!dq.isEmpty() && dq.peekFirst()<=i-k)
            dq.removeFirst();

            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])
            {
                dq.removeLast();
            }
            dq.addLast(i);

            if(i>=k-1)
            list.add(nums[dq.peekFirst()]);


        }
        int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);

        return ans;
    }
}