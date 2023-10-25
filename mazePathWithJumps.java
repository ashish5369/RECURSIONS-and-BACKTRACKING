
//here we can go multiple steps in a single jump  i.e. 1 jump 2 or 3 ka jump is possible in the maze
//here we can go diagonally 
//can jump as many steps the diagonal allows
import java.util.*;

public class mazePathWithJumps {
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sc == dc && sr == dr) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();
        // horizontal moves
        // ms is the move size, that is the maximum move we can do
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h" + ms + hpath);
            }

        }
        // vertical moves
        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpaths = getMazePaths(sr + ms, sc, dr, dc);
            for (String vpath : vpaths) {
                paths.add("v" + ms + vpath);
            }

        }

        // diagonal moves
        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
            ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d" + ms + dpath);
            }

        }

        return paths;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);

        sc.close();

    }
}
