
//  Write a Java recursive method to calculate the sum of all numbers from 1 to n.
import java.util.*;

public class recurSum {

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int r = n + sum(n - 1);
        return r;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sum(n);
        System.out.println("sum = " + m);

        sc.close();
    }

}
