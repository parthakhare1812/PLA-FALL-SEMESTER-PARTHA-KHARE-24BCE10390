import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (3 * a <= b) {
                System.out.println(n * a);
            } else {
                long groups = n / 3;
                long rem = n % 3;

                long ans = groups * b + Math.min(rem * a, b);
                System.out.println(ans);
            }
        }

        sc.close();
    }
}