class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> res=new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String Key = new String(arr);
            if (!map.containsKey(Key))
            {
                map.put(Key, new ArrayList<>());
            }
            map.get(Key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
