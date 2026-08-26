import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            StringBuilder ans = new StringBuilder();

            // Smallest n numbers
            // Median candidates: n+1 ... 2n
            // Largest n numbers: 2n+1 ... 3n

            for (int i = 1; i <= n; i++) {
                int small = i;
                int median = n + i;
                int large = 2 * n + i;

                ans.append(small).append(' ');
                ans.append(median).append(' ');
                ans.append(large).append(' ');
            }

            System.out.println(ans);
        }

        sc.close();
    }
}