package pratik;

import java.util.Scanner;

public class For_soru7 {
    public static void main(String[] args) {

        //Soru 7 ) Interview Question
        //Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("bır String gırınız : ");
        String str = scan.nextLine();
        String tersStr = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            tersStr += str.substring(str.length() - 1 - i, str.length() - i);
        }
        System.out.println(tersStr);
    }
}
