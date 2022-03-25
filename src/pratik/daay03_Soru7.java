package pratik;

import java.util.Scanner;

public class daay03_Soru7 {
    public static void main(String[] args) {

        //Soru 7)
        //Kullanicidan ismini alip isminin bas harfini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz : ");
        String isim= scan.next();

        System.out.println(isim.charAt(0));
    }
}
