class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> b = new ArrayList<>();
        long a =1;
        b.add((int)a);
        System.out.print(a);
        for(int i =1;i<=rowIndex;i++)
        {
            a = a*(rowIndex-i+1);
            a = a/i;
        b.add((int)a);
        }
        return b;
    }
}