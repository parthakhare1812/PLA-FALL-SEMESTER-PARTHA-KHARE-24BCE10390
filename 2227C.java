import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            List<Integer> s6 = new ArrayList<>();
            List<Integer> s2 = new ArrayList<>();
            List<Integer> s1 = new ArrayList<>();
            List<Integer> s3 = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % 6 == 0) {
                    s6.add(x);
                } else if (x % 2 == 0) {
                    s2.add(x);
                } else if (x % 3 == 0) {
                    s3.add(x);
                } else {
                    s1.add(x);
                }
            }

            StringBuilder ans = new StringBuilder();

            for (int x : s6) ans.append(x).append(" ");
            for (int x : s2) ans.append(x).append(" ");
            for (int x : s1) ans.append(x).append(" ");
            for (int x : s3) ans.append(x).append(" ");

            System.out.println(ans.toString().trim());
        }

        sc.close();
    }
}