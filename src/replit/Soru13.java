package replit;

public class Soru13 {
    //Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.
    //
    //input : ade1r4d3
    //
    //output : 8
    //
    //     Hint :
    //     Use Character.isDigit()
    //     Integer.valueOf()
    //


    public static void main(String[] args) {

        String str = "ade1r4d3";


        sumDigits(str);


    }

    private static void sumDigits(String str) {
        int toplam = 0;


        for (int i = 0; i < str.length(); i++) {
            int digit = 0;
            if (Character.isDigit(str.charAt(i))) {
                digit = Integer.parseInt(str.substring(i,i+1));
            }
            toplam += digit;
        }

        System.out.println(toplam);


    }

}
