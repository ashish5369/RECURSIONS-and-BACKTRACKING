import java.util.Scanner;

public class recurExponent {

    static double result(double n, int pow) {
        if (pow == 0) {
            return 1;
        }
        return n * result(n, pow - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int power = sc.nextInt();
        double m = result(n, power);
        System.out.println(m);
        sc.close();
    }
}
