class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        for(String a : strs)
        {
            char[] ch = a.toCharArray();
            Arrays.sort(ch);
            String st = new String(ch);
            if(!m.containsKey(st))
            {
                m.put(st,new ArrayList<>());
            }
            m.get(st).add(a);
        }
        return new ArrayList<>(m.values());
    }
}