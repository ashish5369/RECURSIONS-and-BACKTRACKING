import java.util.*;

public class recurPrintMazePathwJumps {

    public static void printMazePath(int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        for (int ms = 1; ms <= dc - sc; ms++) {
            printMazePath(sr, sc + ms, dr, dc, psf + "h" + ms);
        }
        for (int ms = 1; ms <= dr - sr; ms++) {
            printMazePath(sr + ms, sc, dr, dc, psf + "v" + ms);
        }

        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
            printMazePath(sr + ms, sc + ms, dr, dc, psf + "d" + ms);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePath(1, 1, n, m, "");
        sc.close();

    }
}
