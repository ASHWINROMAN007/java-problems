class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> re = new ArrayList<>();
        for(int i =0 ; i<expression.length();i++){
            char c = expression.charAt(i);
            if(c=='+'||c=='-'||c=='*')
            {
                List<Integer> leftre = diffWaysToCompute(expression.substring(0,i));
                List<Integer>  rightre = diffWaysToCompute(expression.substring(i+1));    
                for(int left : leftre)
                {
                    for(int right : rightre)
                    {
                        switch(c)
                        {
                            case '+':
                                re.add(left+right);
                                break;
                            case '-':
                                 re.add(left-right);
                                 break;
                            case '*':
                                 re.add(left*right);
                                 break;

                        }
                    }
                }        
        }
    
        }
        if (re.isEmpty()) re.add(Integer.parseInt(expression));
        return re;
    

}
}
