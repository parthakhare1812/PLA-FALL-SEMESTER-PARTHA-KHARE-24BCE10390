import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine().trim());

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());

                if (n == 1) {
                    out.append("1 ");
                } else if (x == 1 || x == n) {
                    out.append("2 ");
                } else {
                    out.append("1 ");
                }
            }

            out.append('\n');
        }

        System.out.print(out);
    }
}