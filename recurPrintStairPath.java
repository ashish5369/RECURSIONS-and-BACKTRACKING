//this is not a faith and expectation type of recursion
//it is a type of level , here we solve from below to top , while in faith we used to solve from top to bottom
// here in this typw of case we print answer in the base case

import java.util.*;

public class recurPrintStairPath {
    public static void printStairPath(int n, String path) {
        if (n < 0) {
            return;
        }
        if (n == 0) {
            System.out.println(path);
        }

        printStairPath(n - 1, path + "1");
        printStairPath(n - 2, path + "2");
        printStairPath(n - 3, path + "3");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairPath(n, "");
        sc.close();
    }
}
