package replit;

public class Soru11 {
    //Write a return method to reverse number.
    //
    //Input : 12345
    //
    //Output : 54321

    public static void main(String[] args) {
String num="12345";

String tersSayı=reverse(num);

        System.out.println(tersSayı);



    }

    private static String reverse(String num) {
String str="";

        for (int i = 0; i <num.length() ; i++) {
            str+=num.substring(num.length()-1-i,num.length()-i);
        }
        return str;
    }
}
