import java.util.*;

class Solution {
    static void fu(int i,int n, int[] nums, List<Integer> li, List<List<Integer>> re) {
        if (i == n) {
            re.add(new ArrayList<>(li));
            return;
        }

        
        fu(i+ 1,n,nums, li, re);
        li.add(nums[i]);
        fu(i+ 1,n,nums, li, re);
        li.remove(li.size() - 1);
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> re = new ArrayList<>();
        fu(0,nums.length,nums, new ArrayList<>(), re);
        return re;
    }

}
