class Solution {
    public String clearDigits(String s) {
        int n = s.length();
        Stack <Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
                continue;
            }
            st.push(i);
        }
        StringBuilder e = new StringBuilder();
        for(int i : st)
        {
            e.append(s.charAt(i));
        }
        return e.toString();

            

    }
}