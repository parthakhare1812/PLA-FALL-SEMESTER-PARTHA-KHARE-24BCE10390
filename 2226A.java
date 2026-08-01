import java.util.*;

public class Main {

    static final long MOD = 676767677L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long ans = 0;
            int last = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                last = x;

                if (x > 1) {
                    ans += x;
                }
            }

            if (last == 1) {
                ans++;
            }

            System.out.println(ans % MOD);
        }

        sc.close();
    }
}