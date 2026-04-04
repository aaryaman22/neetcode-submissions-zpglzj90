class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        
        for(String s : strs){
            char[] chr = s.toCharArray();
            Arrays.sort(chr);
            String str = new String(chr);
            mp.computeIfAbsent(str, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
