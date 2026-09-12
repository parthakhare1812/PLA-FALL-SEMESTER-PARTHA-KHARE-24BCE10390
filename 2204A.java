import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean[] visited = new boolean[n];
            int pos = 0;

            visited[pos] = true;

            for (int i = 0; i < n; i++) {
                if (s.charAt(pos) == 'L') {
                    pos--;
                } else {
                    pos++;
                }

                visited[pos] = true;
            }

            int ans = 0;

            for (boolean x : visited) {
                if (x) {
                    ans++;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}