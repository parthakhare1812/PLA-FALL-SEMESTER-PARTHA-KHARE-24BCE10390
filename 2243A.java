import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int c = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            for (int i = 0; i < n; i++)
                b[i] = sc.nextInt();

            long ans = Long.MAX_VALUE;

            // Case 1 : no reorder
            boolean ok = true;
            long cost = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] < b[i]) {
                    ok = false;
                    break;
                }
                cost += a[i] - b[i];
            }

            if (ok)
                ans = Math.min(ans, cost);

            // Case 2 : reorder once
            int[] sa = a.clone();
            int[] sb = b.clone();

            Arrays.sort(sa);
            Arrays.sort(sb);

            ok = true;
            cost = c;

            for (int i = 0; i < n; i++) {
                if (sa[i] < sb[i]) {
                    ok = false;
                    break;
                }
                cost += sa[i] - sb[i];
            }

            if (ok)
                ans = Math.min(ans, cost);

            if (ans == Long.MAX_VALUE)
                System.out.println(-1);
            else
                System.out.println(ans);
        }

        sc.close();
    }
}