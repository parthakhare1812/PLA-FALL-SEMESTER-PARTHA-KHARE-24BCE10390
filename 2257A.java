import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder output = new StringBuilder();

        while (t-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            // available[c] = whether we currently have a word
            // whose first letter is c.
            boolean[] available = new boolean[26];

            for (int i = 0; i < n; i++) {
                String word = br.readLine().trim();

                char first = word.charAt(0);

                available[first - 'a'] = true;
            }

            String[] abbreviations = new String[m];

            for (int i = 0; i < m; i++) {
                abbreviations[i] = br.readLine().trim();
            }

            boolean[] created = new boolean[m];

            int createdCount = 0;

            /*
             * Keep looking for an abbreviation that can currently
             * be constructed.
             *
             * Since m <= 100, O(m^2 * length) is easily fast enough.
             */
            boolean progress = true;

            while (progress) {
                progress = false;

                for (int i = 0; i < m; i++) {

                    if (created[i]) {
                        continue;
                    }

                    String s = abbreviations[i];

                    boolean possible = true;

                    for (int j = 0; j < s.length(); j++) {
                        int letter = s.charAt(j) - 'A';

                        if (!available[letter]) {
                            possible = false;
                            break;
                        }
                    }

                    if (possible) {
                        created[i] = true;
                        createdCount++;

                        // This abbreviation itself becomes a word.
                        // Its first character can now be used.
                        int firstLetter = s.charAt(0) - 'A';

                        available[firstLetter] = true;

                        progress = true;
                    }
                }
            }

            if (createdCount == m) {
                output.append("YES\n");
            } else {
                output.append("NO\n");
            }
        }

        System.out.print(output);
    }
}