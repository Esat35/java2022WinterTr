package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // verilen bir array'in tekrar eden elementlerini
        // sadece bir kere yazdiran bir method olusturun

        Integer arr[]= {3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayiTkerarsızyaz(arr);
    }

    private static void arrayiTkerarsızyaz(Integer[] arr) {
        Set<Integer> tekarsızElementler=new HashSet<Integer>();

        for (Integer each:arr) {
            tekarsızElementler.add(each);
        }
        System.out.println(tekarsızElementler);
    }
}
