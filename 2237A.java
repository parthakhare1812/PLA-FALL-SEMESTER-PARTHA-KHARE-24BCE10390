import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long ans = 0;
            int prefixMin = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                prefixMin = Math.min(prefixMin, x);
                ans += prefixMin;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}