import java.util.*;

//tell all the indices of the given number 

// the biggest problem is that we have to return the array with all the occurencs of the number , but we dont knwo how many occurence we are going to hava, so we dont knwo the lenght of the array that needs to be crewted

// so to solbve the problem we are going to --while going into recurrences we are going to count the number of occurences and after reachingf the last we are going to create an array of that lenght adn while coming back we are going to add the index postionts of element

// as we have two direction in recursion

// first going adn then coming back
// so we are going to calculate the number of occurencs while going only 

// to do this we are going to intorduce a new variable called found so far or fsf ,which is going to ge incremented eveytime we found the element while going deep into the recursion

// while returning we are not ocmparing again 
// as when we sent the recursion statement after comparing it is waiting for the chnace
// so it already knwos that, we have compared it and hence we are seding , so it waits to get returned 
// so here line 1.1 waits to get an array , adn heere are we have compred so it waits to add something to array as it has compoared that at this position we have the same data
// but inline 2.1 it waits for the array but it does not add anything to the array as it knwos that at this index postion the data is not smae as requested so just return the array without doing naything

// and this way we just ran comaprion once and we were able to obtain the correct array

public class recurAllIndicesArray {

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
            // here we are returning an array of lenght = niumber of occurneces of the
            // number
        }

        if (arr[idx] == x) {
            int[] iarr = allIndices(arr, x, idx + 1, fsf + 1); // line 1.1
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, x, idx + 1, fsf); // line 2.1
            return iarr;
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

        allIndices(arr, d, 0, 0);
        System.out.println("the new array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();

    }
}
