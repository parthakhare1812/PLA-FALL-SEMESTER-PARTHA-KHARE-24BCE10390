import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();

            int height = d / m + 1;
            int towers = (n + height - 1) / height;

            System.out.println(towers);
        }

        sc.close();
    }
}