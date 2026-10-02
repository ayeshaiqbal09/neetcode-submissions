class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int n=triplets.length;
        HashSet<Integer> set=new HashSet<>();
        for(int row[]:triplets)
        {
            if(row[0]>target[0] || row[1]>target[1] || row[2]>target[2])continue;
            for(int i=0;i<row.length;i++)
            {
                if(row[i]==target[i])
                set.add(i);
            }
        }
        return set.size()==3;
    }
}
