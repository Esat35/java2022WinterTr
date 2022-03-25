package replit;

public class Soru09 {
    //Write a java program to reverse the number which user entered.
    //
    //Input :1238
    //Output :Reverse Of The Number: 8321


    public static void main(String[] args) {

        String number = "1238";
        String reverseNumber="";

        for (int i = 0; i <number.length() ; i++) {
            reverseNumber+=number.substring(number.length() -1-i,number.length()-i);

        }

        System.out.println(reverseNumber);

    }
}
