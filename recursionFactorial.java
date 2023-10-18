
// Write a Java recursive method to calculate the factorial of a given positive integer.
import java.util.*;

class recursionFactorial {

    static int recursionFunc(int n) {
        if (n == 1) {
            return 1;
        }

        return n * recursionFunc(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = recursionFunc(n);
        System.out.println(answer);
        sc.close();

    }
}
