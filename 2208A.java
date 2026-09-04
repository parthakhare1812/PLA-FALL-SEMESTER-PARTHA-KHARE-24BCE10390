import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashMap<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int x = sc.nextInt();
                    freq.put(x, freq.getOrDefault(x, 0) + 1);
                }
            }

            int limit = n * (n - 1);
            boolean possible = true;

            for (int count : freq.values()) {
                if (count > limit) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}