
class Solution {
    class Pair
    {
        String wrd;
        int steps;
        public Pair(String wrd, int steps)
        {
            this.wrd=wrd;
            this.steps=steps;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        Queue<Pair> q = new LinkedList<>();
        for (String s : wordList) {
            set.add(s);
        }
        set.remove(beginWord);
        q.add(new Pair(beginWord, 1));
        
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int count=p.steps;
            String st=p.wrd;
            if (st.equals(endWord))
                return count;
            
            for (int i = 0; i < st.length(); i++) {
                for (char x = 'a'; x <= 'z'; x++) {
                    char ch[] = st.toCharArray();
                    ch[i]=x;
                    String word=new String(ch);
                    if(set.contains(word))
                    {
                        q.add(new Pair(word, count+1));
                        set.remove(word);
                        
                    }
                }
            }
        }
        return 0;
    }
}
