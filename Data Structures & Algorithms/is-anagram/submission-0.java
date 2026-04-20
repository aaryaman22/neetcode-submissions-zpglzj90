class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;

        int[] fi = new int[26];
        int len = s.length();
        for(int i = 0 ; i < len ; i++){
            fi[s.charAt(i)-'a']++;
            fi[t.charAt(i)-'a']--;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(fi[i] != 0){
                return false;
            }
        }
        return true;
    }
}
