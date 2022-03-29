package replit;

import java.util.ArrayList;
import java.util.List;

public class Soru23 {
    //Write a program that accepts an integer as input and prints first 10 prime numbers greater than input Check numbers if they are even or not in a return method.
    //
    //Input : 5
    //
    //Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]

    public static void main(String[] args) {
        int input = 5;

        List<Integer> list = new ArrayList<Integer>();
        boolean asalMı=true;
        int adet = 0;


        while (adet<10){
            for (int i = 2; i <input;i++){
                if (input%i==0){
                    asalMı=false;
                }

            }
            if (asalMı){
                list.add(input);
                adet++;

            }
            input++;
        }
        System.out.println(list);
    }

}
