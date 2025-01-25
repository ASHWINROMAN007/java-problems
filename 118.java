class Solution {
    // Generate a single row of Pascal's Triangle
    public List<List<Integer>> generate(int numRows) {
                List<List<Integer>> triangle = new ArrayList<>();

        // Store the entire Pascal's Triangle
        for (int row = 1; row <= numRows; row++) {
            triangle.add(pascalTriangle(row));
        }
        return triangle;
    }
        public List<Integer> pascalTriangle(int n) {
     List<Integer> row = new ArrayList<>();
        long value = 1;
        row.add((int) value); // First element is always 1
        for (int col = 1; col < n; col++) {
            value = value * (n - col) / col;
            row.add((int) value);
        }
        return row;
    }


    }
