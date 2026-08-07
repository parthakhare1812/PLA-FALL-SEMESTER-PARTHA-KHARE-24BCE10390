import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int even = 2;
            int odd = 1;

            int[] p = new int[n + 1];

            // Odd positions -> even numbers
            for (int i = 1; i <= n; i += 2) {
                p[i] = even;
                even += 2;
            }

            // Even positions -> odd numbers
            for (int i = 2; i <= n; i += 2) {
                p[i] = odd;
                odd += 2;
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(p[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}