class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer, List<int[]>> map=new HashMap<>();
        for(int time[]: times)
        {
            map.computeIfAbsent(time[0], key->new ArrayList<>()).add(new int[]{time[1], time[2]});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a-> a[0]));
        pq.add(new int[]{0, k});
        int t=0;
        HashSet<Integer> set=new HashSet<>();
        while(!pq.isEmpty())
        {
            int curr[]=pq.poll();
            int w1=curr[0];
            int n1=curr[1];
            if(set.contains(n1))continue;

            set.add(n1);
            t=w1;
            if(map.containsKey(n1))
            {
                for(int next[]:map.get(n1))
                {
                    int w2=next[1];
                    int n2=next[0];
                    if(!set.contains(n2))
                    {
                        pq.offer(new int[]{w1+w2, n2});
                    }
                }
            }
        }
        return set.size()==n?t:-1;
    }
}
