import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                min = Math.min(min, x);
                max = Math.max(max, x);
            }

            int range = max - min;
            System.out.println((range + 1) / 2);
        }

        sc.close();
    }
}