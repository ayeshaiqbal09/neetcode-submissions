class Solution {
    public boolean isPalindrome(String s) {
        int l=0, r=s.length()-1;
        while(l<r)
        {
            char ch=s.charAt(r);
            char lh=s.charAt(l);
            if(!Character.isLetterOrDigit(ch))
            {
                
                r--;
                
            }
            else if(!Character.isLetterOrDigit(lh))l++;
            else
            {
                if(Character.toLowerCase(ch)!=Character.toLowerCase(lh))return false;
                l++;
                r--;
            }

        }
        return true;
    }
}
