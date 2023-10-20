import java.util.Scanner;

public class recurLastIndexArray {

    public static int lastIndex(int arr[], int idx, int data) {
        if (idx == arr.length) {
            return -1;
        }

        int lia = lastIndex(arr, idx + 1, data);
        if (lia == -1) {
            if (arr[idx] == data) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return lia;
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

        System.out.println(lastIndex(arr, 0, d));
        sc.close();
    }
}
