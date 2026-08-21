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

            boolean possible = true;

            for (int i = 0; i < n - 1; i++) {

                // We need a[i] < a[i + 1].
                if (a[i] >= a[i + 1]) {

                    long need = a[i] - a[i + 1] + 1;

                    // We can move at most a[i] - 1 books.
                    if (need > a[i] - 1) {
                        possible = false;
                        break;
                    }

                    a[i] -= need;
                    a[i + 1] += need;
                }
            }

            // Final verification
            for (int i = 0; i < n - 1 && possible; i++) {
                if (a[i] >= a[i + 1]) {
                    possible = false;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}