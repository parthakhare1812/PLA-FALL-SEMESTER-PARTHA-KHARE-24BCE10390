import java.util.*;

public class Main {

    static int ceilDiv(int a, int b) {
        return (a + b - 1) / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            // Option 1: No AI
            int withoutAI = ceilDiv(n, x + y);

            // Option 2: Use AI
            int withAI;

            int finishByMaxim = ceilDiv(n, x);

            if (finishByMaxim <= z) {
                withAI = finishByMaxim;
            } else {
                int remaining = n - x * z;
                withAI = z + ceilDiv(remaining, x + 10 * y);
            }

            System.out.println(Math.min(withoutAI, withAI));
        }

        sc.close();
    }
}