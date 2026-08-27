import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long a1 = Long.parseLong(st.nextToken());

            // We only need the first element.
            // Consume the remaining elements.
            for (int i = 1; i < n; i++) {
                st.nextToken();
            }

            st = new StringTokenizer(br.readLine());
            long b1 = Long.parseLong(st.nextToken());

            // Consume the remaining elements.
            for (int i = 1; i < m; i++) {
                st.nextToken();
            }

            long beaTurns = a1 + n - 1;
            long verTurns = b1 + m - 1;

            if (beaTurns >= verTurns) {
                out.append(1).append('\n');
            } else {
                out.append(2).append('\n');
            }
        }

        System.out.print(out);
    }
}