class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        List<Integer> list1 = flattenMatrix(mat1);
        List<Integer> list2 = flattenMatrix(mat2);
        int count = 0, i = 0, j = list2.size() - 1;
        
        while (i < list1.size() && j >= 0) {
            int sum = list1.get(i) + list2.get(j);
            if (sum == x) {
                count++;
                i++;
                j--;
            } else if (sum < x) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
    
    private List<Integer> flattenMatrix(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : mat) {
            for (int num : row) {
                list.add(num);
            }
        }
        return list;
    }
}