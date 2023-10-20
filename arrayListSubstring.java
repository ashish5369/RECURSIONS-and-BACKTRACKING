import java.util.ArrayList;
import java.util.Scanner;

public class arrayListSubstring {

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);

        ArrayList<String> mres = new ArrayList<>();
        for (String rstr : rres) {
            mres.add("" + rstr);

        }
        for (String rstr : rres) {

            mres.add(ch + rstr);
        }
        return mres;

    }

    public static void main(String[] args) {
        // subsquence where we are we have no order like ,abc
        // so we can have
        // cba a bc cb , that anything can or not come ,and might be present in any
        // order, so it is basically 2^n subsquences possible for each letter

        // and in substring we have to have the order, eg abc--- so b has to come after
        // a , it cannot come before a in the substring, it can be without a,like bc ,
        // but if a is presetn in the string then it must have the order maintained
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
        sc.close();

    }
}
