import java.util.*;

public class getMazePath {
    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {

        if (sc == dc && sr == dr) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        // if we move horizontal then the path is going to come wiht and this what we
        // are going to have FAITH

        // ArrayList<String> hpaths = getMazePath(sr, sc + 1, dr, dc);

        // for the vertical paths
        // ArrayList<String> vpaths = getMazePath(sr + 1, sc, dr, dc);

        // and one thing we will notice
        // for example i am in the 3rd row, so now the only movement that can happen in
        // horizonatla and if i am in the last column the only thing i can do is fo
        // vertical , this we have to restriuc this motiona and for that we change the
        // code
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if (sc < dc) {
            hpaths = getMazePath(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vpaths = getMazePath(sr + 1, sc, dr, dc);
        }

        // the above means that only if we are not in the last column then only weill
        // increment and do a horizontal movement to reach the next column , so that we
        // do not exceed and reach out of bounds

        // and si,milarly if we are not in the last wor then only we will incremnet to
        // reach the next row

        ArrayList<String> paths = new ArrayList<>();

        for (String hpath : hpaths) {
            paths.add("h" + hpath);
        }
        for (String vpath : vpaths) {
            paths.add("v" + vpath);
        }
        return paths;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> paths = getMazePath(1, 1, n, m);
        System.out.println(paths);

        sc.close();
    }
}
