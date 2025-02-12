class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.indexOf(part)!=-1)
        {
            int st = sb.indexOf(part);
            sb.delete(st,st+part.length());
        }
        return sb.toString();
        
    }
}