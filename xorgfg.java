class Solution {
    static ArrayList<Integer> getXor(ArrayList<Integer> A, int N) {
        int s=0;
        for(int a : A)
        {
            s^=a;
        }
        ArrayList<Integer> re = new ArrayList<>();
        for(int a : A)
        {
            re.add(s^a);
        }
        return re;
    }
}