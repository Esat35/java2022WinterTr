package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {

        String str="java cok guzel";
        System.out.println(str.hashCode());//520405140

        String str2="hava cok guzel";
        System.out.println(str2.hashCode());//1531522390

        Set<Integer> sayıKumesı=new HashSet<>();
        System.out.println(sayıKumesı.hashCode());//0

        sayıKumesı.add(10);
        System.out.println(sayıKumesı.hashCode());//10

        sayıKumesı.add(20);
        System.out.println(sayıKumesı.hashCode());//30



    }
}
