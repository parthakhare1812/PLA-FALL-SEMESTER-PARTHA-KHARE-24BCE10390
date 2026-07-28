import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int c0 = 0, c1 = 0, c2 = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 0) c0++;
                else if (x == 1) c1++;
                else c2++;
            }

            int[][] dp = new int[c1 + 1][c2 + 1];

            for (int i = 0; i <= c1; i++) {
                for (int j = 0; j <= c2; j++) {

                    if (i >= 1 && j >= 1)
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);

                    if (i >= 3)
                        dp[i][j] = Math.max(dp[i][j], dp[i - 3][j] + 1);

                    if (j >= 3)
                        dp[i][j] = Math.max(dp[i][j], dp[i][j - 3] + 1);
                }
            }

            System.out.println(c0 + dp[c1][c2]);
        }

        sc.close();
    }
}