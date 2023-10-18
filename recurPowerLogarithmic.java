import java.util.Scanner;

public class recurPowerLogarithmic {

    static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xpnb2 = power(x, n / 2);
        int xn = xpnb2 * xpnb2;
        if (n % 2 == 1) {
            xn = xn * x;
        }
        return xn;
    }

    // why this is faster as we are mo0ving n/2 everytimes, that is n/2 . n/4.n/8
    // this is a GP and because of this we have logn number of levels that is
    // iteration is logn so the time complexity is logn instead of n like the other
    // case where we weere going through n levels

    public static void main(String[] args) {
        // the whole concept lies in the fasct that logarithmic exponents is faster like
        // 3^2=3*3 , and we also klnwo that 3^2=(3^1)*(3^1) this is same , but this is
        // faster in terms of time complexity but this isvalid for the even terms but if
        // we have odd numbers then x^n=x^n/2 * x^n/2 * x .so here we have to factor
        // this more factor adn then multipy the number
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int xn = power(x, n);
        System.out.println(xn);
        sc.close();

    }
}
