import java.util.*;

public class recurFirstIndexArray {

    public static int index(int arr[], int idx, int data) {
        if (idx == arr.length) {
            return -1;
        }

        if (data == arr[idx]) {
            return idx;
        } else {
            int fiisa = index(arr, idx + 1, data);
            return fiisa;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        System.out.println(index(arr, 0, d));
        sc.close();
    }
}
