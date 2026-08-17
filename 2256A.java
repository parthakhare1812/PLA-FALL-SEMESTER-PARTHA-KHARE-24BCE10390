import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long[] a = new long[3];

            a[0] = sc.nextLong();
            a[1] = sc.nextLong();
            a[2] = sc.nextLong();

            Arrays.sort(a);

            long originalRange = a[2] - a[0];
            long afterOperation = a[1];

            long answer = Math.min(originalRange, afterOperation);

            System.out.println(answer);
        }

        sc.close();
    }
}