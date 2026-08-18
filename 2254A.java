import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int[] p = new int[3];

            p[0] = sc.nextInt();
            p[1] = sc.nextInt();
            p[2] = sc.nextInt();

            int rounds = 0;

            while (p[0] != p[1] &&
                   p[1] != p[2] &&
                   p[0] != p[2]) {

                Arrays.sort(p);

                // Smallest gets 1 token
                p[0]++;

                // Largest gives 1 token
                p[2]--;

                rounds++;
            }

            System.out.println(rounds);
        }

        sc.close();
    }
}