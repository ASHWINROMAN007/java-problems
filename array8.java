import java.util.*;
class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Set<Integer> seenNumbers = new HashSet<>();
        Set<String> seenPairs = new HashSet<>();

        for (int num : arr) {
            int complement = -num;
            if (seenNumbers.contains(complement)) {
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);
                String pairKey = a + "," + b;

                if (!seenPairs.contains(pairKey)) {
                    seenPairs.add(pairKey);
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(a);
                    pair.add(b);
                    result.add(pair);
                }
            }
            seenNumbers.add(num);
        }

        // Sort the result array to ensure pairs and the solution array are in sorted order
        result.sort((pair1, pair2) -> {
            if (!pair1.get(0).equals(pair2.get(0))) {
                return pair1.get(0) - pair2.get(0); // Sort by the first element
            }
            return pair1.get(1) - pair2.get(1); // Sort by the second element if the first elements are equal
        });

        return result;
    }