package pratik;

import java.util.Scanner;

public class day03_Soru2 {
    public static void main(String[] args) {

        //Soru 2)
        //Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini
        //hesaplayip yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("karenin kenar uzunlugunu giriniz : ");
        double kenar=scan.nextDouble();

        double cevre=4*kenar;
        double alan=kenar*kenar;

        System.out.println("Karenin çevresi : "+cevre);
        System.out.println("Karenin alanı : "+alan);
    }
}
