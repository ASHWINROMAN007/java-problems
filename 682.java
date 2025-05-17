class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String a : operations)
        {
             if(a.equals("C")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(a.equals("D")){
                if(!st.isEmpty()){
                    int ele = st.peek();
                    st.push(ele*2);
                }
            }
             else if(a.equals("+")){
                if(!st.isEmpty()){
                    int top = st.pop();
                    int second_top = st.peek();
                    st.push(top);
                    st.push(second_top + top);
                }
            } 
            else{
                st.push(Integer.parseInt(a));
            }
        }
         int ans = 0;
        if(st.isEmpty()) return ans;
        for(int s : st){
            ans += s;
        }
        return ans;
    }
}