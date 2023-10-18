import java.util.Scanner;

public class recurPowerLinear {

    static int powerLinear(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * powerLinear(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(powerLinear(x, n));

        sc.close();
    }
}
