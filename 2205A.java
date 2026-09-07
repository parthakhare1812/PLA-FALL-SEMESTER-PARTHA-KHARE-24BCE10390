import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];

            int pos = 0;

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
                if (p[i] == n) {
                    pos = i;
                }
            }

            int temp = p[0];
            p[0] = p[pos];
            p[pos] = temp;

            for (int x : p) {
                System.out.print(x + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}