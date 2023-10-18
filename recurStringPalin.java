import java.util.*;

public class recurStringPalin {
    static boolean ifpalin(String m) {

        if (m.length() <= 1) {
            return true;
        }

        char firstChar = m.charAt(0);
        char lastChar = m.charAt(m.length() - 1);

        if (firstChar != lastChar) {
            return false;
        }

        String remainingString = m.substring(1, m.length() - 1);
        return ifpalin(remainingString);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        boolean b = ifpalin(m);
        System.out.println(b);
        sc.close();

    }
}