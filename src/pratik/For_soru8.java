package pratik;

import java.util.Scanner;

public class For_soru8 {
    public static void main(String[] args) {
        //Soru 8 ) Interview Question
        //Kullanicidan bir String isteyin ve Stringi tersine ceviren
        //bir method yazin.

        Scanner scan=new Scanner(System.in);
        System.out.print("bır cumle gırınız : ");
        String str=scan.nextLine();

        tersineCeviren(str);






    }

    private static void tersineCeviren(String str) {
     String   tersStr="";

        for (int i = 0; i <=str.length()-1;  i++) {
            tersStr+=str.substring(str.length()-1-i,str.length()-i);
        }
        System.out.println(tersStr);
    }
}
