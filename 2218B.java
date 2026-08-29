import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long sum = 0;
            long max = Long.MIN_VALUE;

            for (int i = 0; i < 7; i++) {
                long x = Long.parseLong(st.nextToken());

                sum += x;
                max = Math.max(max, x);
            }

            long answer = 2 * max - sum;

            out.append(answer).append('\n');
        }

        System.out.print(out);
    }
}