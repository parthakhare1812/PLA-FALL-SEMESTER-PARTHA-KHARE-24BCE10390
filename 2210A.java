import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine().trim());

            // Put 2 first
            out.append(2).append(" ");

            // Then n, n-1, ..., 3
            for (int i = n; i >= 3; i--) {
                out.append(i).append(" ");
            }

            // Put 1 at the end
            out.append(1);

            out.append('\n');
        }

        System.out.print(out);
    }
}