import java.util.*;

public class recurArrayMax {

    public static int largest(int arr[], int idx) {

        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int max = largest(arr, idx + 1);

        if (max > arr[idx]) {
            return max;

        } else {
            return arr[idx];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(largest(arr, 0));
        sc.close();
    }
}
