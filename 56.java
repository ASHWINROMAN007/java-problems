class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> re = new ArrayList<>();
        for(int a[]:intervals)
        {
            if(re.isEmpty()|| re.get(re.size()-1)[1]<a[0])
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