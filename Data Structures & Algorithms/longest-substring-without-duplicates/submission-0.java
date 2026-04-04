class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int len = s.length();
        int maxLen = 0;
        Set<Character> st = new HashSet<>();
        for(int i = 0 ; i < len ; i++){
            char c = s.charAt(i);
            if(st.contains(c)){
                while(s.charAt(low)!= c){
                    char charToRemove = s.charAt(low);
                    st.remove(charToRemove);
                    low++;
                }
                low++;
            }else{
                st.add(c);
                maxLen = Math.max(maxLen, i-low +1);
            }
        }
        return maxLen;
    }
}
