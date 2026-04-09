class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length())return "";
        
        int[] mp = new int[128];
        for(int i = 0 ; i < t.length() ; i++){
            mp[t.charAt(i)]++;
        }

        int left = 0, right = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            if(mp[c] > 0)count--;
            mp[c]--;
            right++;
            while(count == 0){
                if(right - left < minLen){
                    minLen = right-left;
                    start = left;
                }

                char lc = s.charAt(left);
                mp[lc]++;
                if(mp[lc] > 0)count++;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
