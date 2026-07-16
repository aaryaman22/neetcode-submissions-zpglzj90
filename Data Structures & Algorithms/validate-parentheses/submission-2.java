class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> mp = new HashMap<>();
        mp.put(')', '(');
        mp.put(']', '[');
        mp.put('}', '{');
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(mp.containsKey(c)){
                if(st.isEmpty())return false;
                char ch = st.pop();
                if(mp.get(c)!=ch)return false;
            }else{
                st.push(c);
            }
        }
        if(!st.isEmpty())return false;
        return true;
    }
}
