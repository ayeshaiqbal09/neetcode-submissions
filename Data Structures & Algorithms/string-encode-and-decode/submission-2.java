class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty())return "";
        StringBuilder res=new StringBuilder();
        List<Integer> size=new ArrayList<>();
        for(String s: strs)
        {
            size.add(s.length());
        }
        for(int n: size)
        {
            res.append(n).append(',');
        }
        res.append('#');
        for(String s: strs)
        {
            res.append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if(str.length()==0)return new ArrayList<>();
        List<Integer> size=new ArrayList<>();
        List<String> res=new ArrayList<>();
        int i=0;
        while(str.charAt(i)!='#')
        {
            StringBuilder cnt=new StringBuilder();
            while(str.charAt(i)!=',')
            {
                
                cnt.append(str.charAt(i));
                i++;
            }
            size.add(Integer.parseInt(cnt.toString()));
            i++;
        }
        i++;
        for(int n:size)
        {
            res.add(str.substring(i, i+n));
            i=i+n;
        }
        return res;
    }
}
