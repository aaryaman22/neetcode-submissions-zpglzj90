class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s : strs){
            int[] fi = new int[26];

            for(char c : s.toCharArray()){
                fi[ c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i: fi){
                sb.append(i).append('#');
            }

            mp.computeIfAbsent(sb.toString(), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
