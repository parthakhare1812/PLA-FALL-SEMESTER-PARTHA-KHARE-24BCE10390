import java.util.*;

public class Main {
    static int digitSum(long n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            int answer = 0;

            for (long y = Math.max(1, x); y <= x + 100; y++) {
                if (y - digitSum(y) == x) {
                    answer++;
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}