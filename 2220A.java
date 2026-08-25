import java.util.*;

public class Main {

    static boolean canBeBlocked(boolean[] possible, int x) {
        return possible[x];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            /*
             * Since all values are positive, if we put the largest
             * elements first, smaller elements can never be formed
             * using them.
             *
             * Therefore sort in decreasing order.
             */
            Arrays.sort(a);

            StringBuilder ans = new StringBuilder();

            // Descending order
            for (int i = n - 1; i >= 0; i--) {
                ans.append(a[i]).append(" ");
            }

            /*
             * Verify the construction.
             *
             * We only need subset sums up to 100 because every
             * array value is <= 100.
             */
            boolean[] possible = new boolean[101];
            possible[0] = true;

            boolean valid = true;

            for (int i = 0; i < n; i++) {
                int x = a[n - 1 - i]; // descending order

                if (possible[x]) {
                    valid = false;
                    break;
                }

                // Update subset sums using x.
                for (int sum = 100 - x; sum >= 0; sum--) {
                    if (possible[sum]) {
                        possible[sum + x] = true;
                    }
                }
            }

            if (!valid) {
                System.out.println("-1");
            } else {
                System.out.println(ans);
            }
        }

        sc.close();
    }
}