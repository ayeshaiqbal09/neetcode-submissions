class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length())
            return false;
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
        }
        int k = s1.length();
        if (Arrays.equals(freq1, freq2))
            return true;
        for (int i = k; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;

            freq2[s2.charAt(i - k) - 'a']--;

            if (Arrays.equals(freq1, freq2))
                return true;
        }
        return false;
    }
}
