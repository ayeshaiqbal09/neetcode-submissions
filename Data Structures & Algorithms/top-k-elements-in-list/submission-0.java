//solving via bucket sort

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        List<Integer>[] bucket= new ArrayList[nums.length+1];

        for(int i=0;i<=nums.length;i++)
        {
            bucket[i]= new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> it: map.entrySet())
        {
            bucket[it.getValue()].add(it.getKey());
        }
        int ans[]=new int[k];
        int ind=0;
        for(int i=nums.length; i>=0 && ind<k; i--)
        {
            for(int num: bucket[i])
            {
                ans[ind++]=num;

                if(ind==k)
                break;
            }
        }
         return ans;
    }
}