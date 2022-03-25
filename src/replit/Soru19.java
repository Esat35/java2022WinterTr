package replit;

import java.util.ArrayList;
import java.util.List;

public class Soru19 {
    //Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)
    //
    //input :
    //
    //Learning java is easy
    //
    //output:
    //
    //maximum occurring character is : a

    public static void main(String[] args) {
        String str = "Learning java is easy";
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.substring(i, i + 1));
        }


        int enFazla = 0;
        String harf = "";
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = i; j < list.size(); j++) {
                if (list.get(j).equalsIgnoreCase(list.get(i))) {
                    count++;
                }

            }

            if (count > enFazla) {
                harf = list.get(i);
                enFazla = count;
            }
        }
        System.out.println("maximum occurring character is : " + harf);

    }
}
