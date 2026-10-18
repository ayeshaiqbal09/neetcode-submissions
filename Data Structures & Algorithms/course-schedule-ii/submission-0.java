class Solution {
    public int[] findOrder(int num, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<num;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int it[]:prerequisites)
        {
            adj.get(it[1]).add(it[0]);
        }
        int ind[]=new int[num];
        for(int i=0;i<num;i++)
        {
            for(int it: adj.get(i))
            {
                ind[it]++;
            }

        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<num;i++)
        {
            if(ind[i]==0)q.add(i);
        }
        List<Integer> list=new ArrayList<>();
        while(!q.isEmpty())
        {
            int node=q.poll();
            list.add(node);
            for(int it: adj.get(node))
            {
                ind[it]--;
                if(ind[it]==0)q.add(it);
            }
        }
        int ans[]=new int[num];
        int i=0;
        if(list.size()==num)
        {
            for(int it: list)
            ans[i++]=it;

            return ans;
        }

        return new int[]{};
        
    }
}
