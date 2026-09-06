import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long x = n;
            long ans = 1;

            for (long p = 2; p * p <= x; p++) {
                if (x % p == 0) {
                    ans *= p;

                    while (x % p == 0) {
                        x /= p;
                    }
                }
            }

            if (x > 1) {
                ans *= x;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
