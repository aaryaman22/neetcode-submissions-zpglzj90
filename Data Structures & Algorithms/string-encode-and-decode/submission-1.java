class Solution {
    char underscore = '_';
    public String encode(List<String> strs) {
        // 5_aabbc6_rrrttt10_43e
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            int len = s.length();
            sb.append(len).append(underscore).append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        int len = str.length();
        List<String> ans = new ArrayList<>();
        while(i < len){
            int j = i;
            while(str.charAt(j) != underscore){
                j++;
            }
            int strLen = Integer.valueOf(str.substring(i, j));
            String s = str.substring(j+1, j + 1 + strLen);
            ans.add(s);
            i = j + 1 + strLen;
        }
        return ans;
    }
}
