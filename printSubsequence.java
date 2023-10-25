import java.util.Scanner;

public class printSubsequence {
    public static void printSS(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        // what if it says yes
        printSS(roq, ans + ch);

        // what if the character says no then
        printSS(roq, ans + "");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        printSS(str, "");

        sc.close();
    }
}