package pratik;

import java.util.Scanner;

public class String_manipulation_soru6 {
    public static void main(String[] args) {
        //Soru
        //6 Kullanicidan bir sifre girmesini isteyin Asagidaki sartlari sagliyorsa “Sifre
        //basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
        //sifre girin” yazdirin
        //-
        //Ilk harf buyuk harf olmali
        //-
        //Son harf kucuk harf olmali
        //-
        //Sifre bosluk icermemeli
        //-
        //Sifre uzunlugu en az 8 karakter olmali


        Scanner scan = new Scanner(System.in);
        System.out.print("Şifrenizi giriniz : ");

        String sifre = scan.next();

        if ((sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') && (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z')
                && (!sifre.contains(" ")) && (sifre.length() >= 8)) {

            System.out.println("sifre basarı ıle tamamlandı");
        } else {
            System.out.println("sifre basarısız. tekrar deneyınız .");


        }


    }
}
