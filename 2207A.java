import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int min = 0;
            int max = 0;

            int first = -1;
            int last = -1;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    if (first == -1) {
                        first = i;
                    } else if (i - last > 2) {
                        int len = last - first + 1;
                        min += (len + 1) / 2;
                        max += len;
                        first = i;
                    }

                    last = i;
                }
            }

            if (first != -1) {
                int len = last - first + 1;
                min += (len + 1) / 2;
                max += len;
            }

            System.out.println(min + " " + max);
        }

        sc.close();
    }
}