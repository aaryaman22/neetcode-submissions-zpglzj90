class Solution {
    public int characterReplacement(String s, int k) {
        int[] fi = new int[26];
        int len = s.length();
        int left = 0, maxLen = 0, maxFi = 0;
        for(int r = 0 ; r < len ; r++){
            char c = s.charAt(r);
            fi[c-'A']+=1;
            maxFi = Math.max(maxFi, fi[c-'A']);
            while((r-left+1) - maxFi > k){
                fi[s.charAt(left)-'A']--;
                left++;
            }
            maxLen = r-left+1;
        }
        return maxLen;
    }
}
