package OCA.s33_array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayVeList {
    public static void main(String[] args) {
        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);
    }
}
        /*
        A. [8]
        B. [9]
        C. Something like [Ljava.lang.String;@160bc7c0
        D. An exception is thrown.
        E. The code does not compile.
        */