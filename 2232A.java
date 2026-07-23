import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            TreeMap<Integer, Integer> freq = new TreeMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            int left = 0;
            int right = n;
            int ans = Integer.MAX_VALUE;

            for (int cnt : freq.values()) {
                right -= cnt;
                ans = Math.min(ans, Math.max(left, right));
                left += cnt;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}