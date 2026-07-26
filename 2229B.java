import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[] hi = new long[n];
            long[] lo = new long[n];

            long baseSum = 0;

            for (int i = 0; i < n; i++) {
                hi[i] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {
                long b = sc.nextLong();

                long a = hi[i];

                hi[i] = Math.max(a, b);
                lo[i] = Math.min(a, b);

                baseSum += hi[i];
            }

            long[] prefixMax = new long[n];
            long[] suffixMax = new long[n];

            prefixMax[0] = lo[0];
            for (int i = 1; i < n; i++) {
                prefixMax[i] = Math.max(prefixMax[i - 1], lo[i]);
            }

            suffixMax[n - 1] = lo[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                suffixMax[i] = Math.max(suffixMax[i + 1], lo[i]);
            }

            long ans = baseSum + prefixMax[n - 1];

            for (int i = 0; i < n; i++) {

                long otherMax = 0;

                if (i > 0) otherMax = Math.max(otherMax, prefixMax[i - 1]);
                if (i + 1 < n) otherMax = Math.max(otherMax, suffixMax[i + 1]);

                long currentMax = Math.max(hi[i], otherMax);

                long current =
                        baseSum - (hi[i] - lo[i]) + currentMax;

                ans = Math.max(ans, current);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}