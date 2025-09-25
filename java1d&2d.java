import java.util.ArrayList;

class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j) {
                    s += a[i][j]; // Sum of diagonal elements
                }
            }
        }

        int max = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i]; // Maximum element in array b
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(s);
        result.add(max);
        return result;
    }
}