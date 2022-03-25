package replit;

import java.util.*;

public class Soru22 {
    //Write a program that deletes the letters 'a' from the names in the list given as input.
    //
    //     INPUT :
    //     list1={"Ali","Veli","Ayse","Fatma","Omer"}
    //
    //     OUTPUT :
    //
    //     [Veli,Omer]
    public static void main(String[] args) {

        List<String> list1=new ArrayList<String>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        List<String> list2=new ArrayList<String>();

        for (String s : list1) {
            if (!s.toLowerCase(Locale.ROOT).contains("a")){
                list2.add(s);
            }
        }
        System.out.print("[");



            System.out.print(list2.get(0)+","+list2.get(1));


        System.out.println("]");

    }
}
