import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();

            boolean possible = false;
            int twice = 0;

            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();

                if (x >= 3) {
                    possible = true;
                } else if (x == 2) {
                    twice++;
                }
            }

            if (possible || twice >= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}