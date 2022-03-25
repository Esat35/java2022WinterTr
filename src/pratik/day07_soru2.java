package pratik;

import java.util.Scanner;

public class day07_soru2 {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
        //isimlerini yazdirin
        //Ornek:
        //ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        //ilkHarf=S output = “Sali”
        //*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun isminin ilk harfini giriniz :");
        String ilkHarf= scan.next().toUpperCase();

        if (ilkHarf.equals("P")){
            System.out.println(ilkHarf+" ile baslayan gunler : Pazartesi, Persembe, Pazar");
        }else if (ilkHarf.equals("S")){
            System.out.println(ilkHarf+" ile baslayan gunler :  Salı");
        }else if (ilkHarf.equals("Ç")){
            System.out.println(ilkHarf+" ,le baslayan gunler : Çarsamba");

        }else if (ilkHarf.equals("C")){
            System.out.println(ilkHarf+" ile baslayan gunler : Cuma, Cumartesi");
        }else{
            System.out.println("yanlıs karakter gırdınız lutfen tekrar deneyiniz...");
        }



    }
}
