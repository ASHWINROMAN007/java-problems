class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> inte = new ArrayList<>(Arrays.asList(intervals));
        inte .add(newInterval);
        inte.sort((a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> re = new ArrayList<>();
        for(int[] a : inte)
        {
            if(re.isEmpty()||re.get(re.size()-1)[1]<a[0])
            {
                re.add(a);
            }
            else
            {
                re.get(re.size()-1)[1]=Math.max(re.get(re.size()-1)[1],a[1]);
            }
        }
        return re.toArray(new int[re.size()][]);
    }
}