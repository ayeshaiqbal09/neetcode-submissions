class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        int size=0, end=0;
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),i);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            size++;
            end=Math.max(end, map.get(s.charAt(i)));

            if(end==i)
            {
                res.add(size);
                size=0;
            }
        }
        return res;
    }
}
