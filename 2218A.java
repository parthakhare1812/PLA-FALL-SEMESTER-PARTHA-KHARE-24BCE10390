import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine().trim());

            int y = Math.min(x + 1, 67);

            out.append(y).append('\n');
        }

        System.out.print(out);
    }
}