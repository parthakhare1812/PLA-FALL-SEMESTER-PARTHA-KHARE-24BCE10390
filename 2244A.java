import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int maxLength = 0;
            int currentLength = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '#') {
                    currentLength++;
                    maxLength = Math.max(maxLength, currentLength);
                } else {
                    currentLength = 0;
                }
            }

            int answer = (maxLength + 1) / 2;

            System.out.println(answer);
        }

        sc.close();
    }
}