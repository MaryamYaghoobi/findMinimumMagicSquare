package ir.dotin;

public class Solution {
    public static int findMinimumMagicSquare(int[][] a,
                                             int[][] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != b[i][j])

                    count++;
            }
        }
        return count;
    }

    public static int minimumCost(int[][] a) {
        int[][][] b = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        };
        int mincost = Integer.MAX_VALUE;
        for (int i = 0; i < 8; i++) {
            int x = findMinimumMagicSquare(a, b[i]);
            if (x < mincost)
                mincost = x;
        }
        return mincost;
    }

}
