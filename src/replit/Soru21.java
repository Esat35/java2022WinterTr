package replit;

import java.util.Arrays;

public class Soru21 {
    //Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.
    //
    //Note: Upper and lower case letters, spaces and special characters will not be changed.
    //
    //Input :
    //
    //It is very nice to write code.
    //
    //Output :
    //
    //.edoc etirw ot ecin yrev si tI


    public static void main(String[] args) {

        String str="It is very nice to write code.";

        String arr[]=str.split("");

        String yeniStr=terseCevir(arr);

        System.out.println(yeniStr);
    }

    private static String terseCevir(String[] arr) {
        String tersStr="";

        for (int i = 0; i <arr.length ; i++) {
            tersStr+=arr[arr.length-1-i];
        }


        return tersStr;
    }

}
