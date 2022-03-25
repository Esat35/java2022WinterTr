package pratik;

import java.util.Scanner;

public class String_manipulation_soru5 {
    public static void main(String[] args) {

        //Soru
        //5 Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("4 harfli bir kelime giriniz : ");

        String input = scan.next();
        String tersStr = "" + input.charAt(input.length() - 1);
        tersStr += input.charAt(input.length() - 2);
        tersStr += input.charAt(input.length() - 3);
        tersStr += input.charAt(input.length() - 4);
        System.out.println(tersStr);

    }
}
