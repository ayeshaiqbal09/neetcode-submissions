class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char ch = s.charAt(i);
            char en = s.charAt(j);
            if (!Character.isLetterOrDigit(ch))i++;
            else if(!Character.isLetterOrDigit(en)) j--;
            else if (Character.toLowerCase(ch) != Character.toLowerCase(en))
            {
                
                    return false;
                
            } 
            else {
                    i++;
                    j--;
                }
        }
        return true;
    }
}
