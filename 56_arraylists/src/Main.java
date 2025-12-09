import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args){

        // ArrayList = A resizeable array that stores object (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list  );

        list.remove(0);
        System.out.println(list);

        // set element at index 0 to be 55
        list.set(0, 55);
        System.out.println(list);

        // element at index 1
        System.out.println(list.get(1));

        // size of the list
        System.out.println(list.size());

        // sort
        Collections.sort(list);
        System.out.println(list);

        // iterate
        for(int i : list){
            System.out.println(i);
        }

    }
}
