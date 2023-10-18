//print array wihtour using loop

import java.util.Scanner;

public class recurDispArray {
    // expectation is ki prints from n to the last
    // faith is that ki yeh n+1 se last tak print karna jaanta hai
    public static void displayArray(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        displayArray(arr, idx + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // gettting the input intto the array

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        displayArray(arr, 0);

    }
}
