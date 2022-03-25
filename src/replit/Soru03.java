package replit;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Soru03 {
    //Write a code that returns the duplicate chars in a String array.(interview Question)
    //
    //Input :
    //
    //String str=“Javaisalsoeasy”
    //
    //Output: [a, s]


    public static void main(String[] args) {

        String str="Javaisalsoeasy";
       String arr[]=str.split("");
      ArrayList < String > strList=new ArrayList<String>();



        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {

                if (arr[i].equals(arr[j])){

                    if (!strList.contains(arr[i])){
                        strList.add(arr[i]);
                    }
                    break;
                }
            }
        }
        System.out.println(strList);

    }
}
