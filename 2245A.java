import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            // It is impossible if the required R and L sections overlap.
            if (n < 2 * k) {
                System.out.println(-1);
                continue;
            }

            int flips = 0;

            // First k piggies must face R.
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'L') {
                    flips++;
                }
            }

            // Last k piggies must face L.
            for (int i = n - k; i < n; i++) {
                if (s.charAt(i) == 'R') {
                    flips++;
                }
            }

            System.out.println(flips);
        }

        sc.close();
    }
}