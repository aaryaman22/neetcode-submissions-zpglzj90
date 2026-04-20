class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s : strs){
            int[] fi = new int[26];
            StringBuilder sb = new StringBuilder();
            for( char c : s.toCharArray()){
                fi[c-'a']++;
            }
            for(int i = 0 ; i < 26 ; i++){
                sb.append(fi[i]).append('#');
            }

            mp.computeIfAbsent(sb.toString(),k ->  new ArrayList()).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
