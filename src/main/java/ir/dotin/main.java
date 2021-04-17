package ir.dotin;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int a[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("Enter Rows Matrix :");
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("cost: " + solution.minimumCost(a));

    }
}
