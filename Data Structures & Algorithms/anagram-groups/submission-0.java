class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        //List<List<String>> ans=new ArrayList<>();
        for(int i=0; i<strs.length;i++)
        {
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String Key=new String(ch);
            if(!map.containsKey(Key))
                map.put(Key, new ArrayList<>());
            map.get(Key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}