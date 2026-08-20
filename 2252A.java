import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashMap<Integer, Integer> freq = new HashMap<>();

            long sum = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                sum += x;
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            int maxFreq = 0;
            int mostFrequentValue = 0;

            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    mostFrequentValue = entry.getKey();
                }
            }

            int other = n - maxFreq;

            long answer;

            // We can arrange all cards without triggering the shield.
            if (maxFreq <= other + 1) {
                answer = sum;
            } else {
                // other + 1 copies don't trigger the shield,
                // and the next copy triggers it but still deals damage.
                int usable = Math.min(maxFreq, other + 2);

                answer = (sum - (long) maxFreq * mostFrequentValue)
                        + (long) usable * mostFrequentValue;
            }

            System.out.println(answer);
        }

        sc.close();
    }
}