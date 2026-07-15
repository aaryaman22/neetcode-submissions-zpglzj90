class Solution {
    public boolean isAnagram(String s, String t) {
        int[] fiOfEachChar = new int[26];
        int len = s.length();
        if(len!=t.length())return Boolean.FALSE;
        for(int i = 0 ; i < len ; i++){
            fiOfEachChar[s.charAt(i) - 'a']++;
            fiOfEachChar[t.charAt(i) - 'a']--;
        }
        for(int i : fiOfEachChar){
            if(i!=0)return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
