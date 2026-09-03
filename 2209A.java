import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            // Sort monsters by combat power
            Arrays.sort(a);

            for (int i = 0; i < n; i++) {

                // Since array is sorted, no later monster can be killed
                if (a[i] > c) {
                    break;
                }

                // Use as many flip flops as useful
                long used = Math.min(k, c - a[i]);

                k -= used;

                // Kill the monster
                c += a[i] + used;
            }

            System.out.println(c);
        }

        sc.close();
    }
}