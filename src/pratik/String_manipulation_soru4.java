package pratik;

import java.util.Scanner;

public class String_manipulation_soru4 {
    public static void main(String[] args) {

        //Soru
        //4 Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("isminizi giriniz : ");
        String isim=scan.nextLine();

        System.out.print("soyisminizi giriniz : ");
    String soyisim=scan.nextLine();

    if (isim.length()>soyisim.length()){
        System.out.println("isminiz daha uzun");
    }else if (isim.length()<soyisim.length()){
        System.out.println("soyisminiz daha uzun");
    }else {
        System.out.println("isim ve soyisminiz aynı uzunlukta.");
    }


    }
}
