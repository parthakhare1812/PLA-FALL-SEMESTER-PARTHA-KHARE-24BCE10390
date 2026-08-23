import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            // Process from right to left.
            for (int i = n - 2; i >= 0; i--) {
                if (a[i + 1] > 0) {
                    a[i] += a[i + 1];
                }
            }

            int answer = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] > 0) {
                    answer++;
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}