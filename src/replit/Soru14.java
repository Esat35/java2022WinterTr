package replit;

import java.util.Arrays;

public class Soru14 {
    //Create a custom return type method accepts a name as parameter and prints the name as a char array.
    //
    //(do not use toCharArray() method)
    //
    //Input : John
    //
    //Output :[J, o, h, n]


    public static void main(String[] args) {

        String name = "John";

       char[] arr =caraktereCevir(name);

        System.out.println(Arrays.toString(arr));
    }

    private static char[] caraktereCevir(String name) {
       char arr2[]=new char[name.length()];

        for (int i = 0; i <name.length() ; i++) {
            arr2[i]=name.charAt(i);
        }
        return arr2;

    }


}
