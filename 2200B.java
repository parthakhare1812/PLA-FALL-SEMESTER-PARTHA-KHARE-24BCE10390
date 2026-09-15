import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int minRemaining = n;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] > a[j]) {
                        minRemaining = 1;
                    }
                }
            }

            if (minRemaining == 1) {
                System.out.println(1);
            } else {
                System.out.println(n);
            }
        }

        sc.close();
    }
}