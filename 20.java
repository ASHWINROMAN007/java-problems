class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character,Character> mp = new HashMap<>();
        mp.put(')','(');
        mp.put(']','[');
        mp.put('}','{');
        for(char c : s.toCharArray())
        {
            if(mp.containsValue(c))
            {
                st.push(c);
            }
            else if(mp.containsKey(c))
            {
            if(st.isEmpty()||st.peek()!=mp.get(c))
            {
                return false;
            }
            st.pop();
        } 
        }
        return st.isEmpty();
    }
}