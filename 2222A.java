import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            // count[value] = number of problems having this
            // point increment.
            int[] count = new int[101];

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();

                int value = 100 / a;
                count[value] += a;
            }

            long reach = 0;
            boolean possible = true;

            // Possible coin values are divisors of 100.
            for (int value = 1; value <= 100; value++) {
                if (count[value] == 0) {
                    continue;
                }

                // If this denomination is larger than
                // reach + 1, there is a gap.
                if (value > reach + 1) {
                    possible = false;
                    break;
                }

                reach += (long) value * count[value];
            }

            // We must cover exactly all scores from 0 to 100*n.
            if (reach < 100L * n) {
                possible = false;
            }

            System.out.println(possible ? "Yes" : "No");
        }

        sc.close();
    }
}