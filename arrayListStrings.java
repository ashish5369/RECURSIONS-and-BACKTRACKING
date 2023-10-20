import java.util.ArrayList;

public class arrayListStrings {
    public static void main(String[] args) {

        // STRINGS
        // substring gives the subset of a string
        // we give the output as (statrtuing index , endsing index)
        // it is inclusive for the starting index but does not include the ending index

        // example(1,5)
        // will give -- string with index 1 to 4 , wont include the 5th index

        // ARRAYLIST--array that can grow, or dynamic array

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " " + list.size());

        list.add(12);
        // no fixed size can grow basis of need
        list.add(20);

        // how to print approach 1
        for (int val : list) {
            System.out.println(val);
        }

        // using for loop to print approach 2
        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i); // .get gives the value
            System.out.println(val);
        }

        list.set(0, 15); // this wikll chnage the value at certain index of the arraylist, .add creates a
                         // new index while .set modeifes the existing entries

        list.add(1, 15); // this will add some value at a certain index position

    }
}
