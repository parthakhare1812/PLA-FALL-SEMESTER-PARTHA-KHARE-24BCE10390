import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            long rem = n % 12;

            if (rem != 10) {
                System.out.println(rem + " " + (n - rem));
            } else {
                if (n < 22) {
                    System.out.println(-1);
                } else {
                    System.out.println("22 " + (n - 22));
                }
            }
        }

        sc.close();
    }
}