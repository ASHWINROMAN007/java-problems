import java.util.HashSet;

class Solution {
    public boolean bool(int[] nums, int ind, long p1, long p2, long target,
                        HashSet<Integer> set1, HashSet<Integer> set2) {
        if (p1 > target || p2 > target) return false;

        if (ind == nums.length) {
            return p1 == target && p2 == target && !set1.isEmpty() && !set2.isEmpty();
        }
        set1.add(nums[ind]);
        if (bool(nums, ind + 1, p1 * nums[ind], p2, target, set1, set2)) return true;
        set1.remove(nums[ind]);
        set2.add(nums[ind]);
        if (bool(nums, ind + 1, p1, p2 * nums[ind], target, set1, set2)) return true;
        set2.remove(nums[ind]);

        return false;
    }

    public boolean checkEqualPartitions(int[] nums, long target) {
        if (nums.length < 2) return false;
        return bool(nums, 0, 1, 1, target, new HashSet<>(), new HashSet<>());
    }
}
©leetcode