import java.util.Scanner;

public class recurRevString {
    static String reversal(String n) {
        if (n.length() == 1 || n.isEmpty()) {
            return n;
        }
        String remainingString = n.substring(0, n.length() - 1);
        System.out.println(remainingString);

        return n.charAt(n.length() - 1) + reversal(remainingString);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = reversal(n);
        System.out.print(m);
        sc.close();

    }
}
