
import java.util.*;
// like we used to have keypad in the older phones like that we are going to have combinations here as well
// there 1 mean abc
// 2 def 
// 3ghi
// similarly for all the nukjber form 0 to 9 had some characters assigned to it

// so example someone gives us inout 547
// so it muts giiver us the output of all the combinations of the letters possible bcoz of alphabets present in 5 4 7 keypad
//array has the letters at the indexes,like at index of 1  we have aplabets corresponding to 1 and like that it goes on
// print the arraylist that has all the possible combinations of the code possible

public class keypadCodes {
    // this is a global array that has all the keypad data and we are going to use
    // it to find the possible words
    static String[] codes = { ",;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {

        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        // 678
        char ch = str.charAt(0);// 6
        String ros = str.substring(1); // 78
        ArrayList<String> rres = getKPC(ros); // we have faith that we are going to have all the possible combos of 78
                                              // here and we are getting the 6 words of 78 here . and now we want the
                                              // rest 24 words

        ArrayList<String> mres = new ArrayList<>(); // we want 24 words of 678

        String chforcode = codes[ch - '0'];// as ch will give the ascii value of 6 which is 54, so to find the interger
                                           // do '6' - '0' = 6, this will give the integer value instread of the ascii
                                           // value
        for (int i = 0; i < chforcode.length(); i++) {
            char chcode = chforcode.charAt(i);
            for (String rstr : rres) {
                mres.add(chcode + rstr);
            }
        }
        return mres;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
        sc.close();

    }
}
