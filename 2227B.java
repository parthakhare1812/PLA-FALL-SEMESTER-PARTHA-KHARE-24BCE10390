import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int open = 0, close = 0;

            for (char c : s.toCharArray()) {
                if (c == '(')
                    open++;
                else
                    close++;
            }

            if (open != close) {
                System.out.println("NO");
                continue;
            }

            int balance = 0;
            boolean ok = true;

            for (char c : s.toCharArray()) {
                if (c == '(')
                    balance++;
                else
                    balance--;

                if (balance < -1) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}