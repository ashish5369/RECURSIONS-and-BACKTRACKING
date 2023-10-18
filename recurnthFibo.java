
// Write a Java recursive method to calculate the nth Fibonacci number.
import java.util.*;

public class recurnthFibo {

    static int recur(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return recur(n - 1) + recur(n - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = recur(n);
        System.out.println("the " + n + "th fibonnaci number is " + m);
        sc.close();
    }
}
