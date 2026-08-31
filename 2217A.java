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
            int k = Integer.parseInt(st.nextToken());

            long sum = 0;

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                sum += Long.parseLong(st.nextToken());
            }

            if (sum % 2 == 1 || (n * k) % 2 == 0) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }

        System.out.print(out);
    }
}