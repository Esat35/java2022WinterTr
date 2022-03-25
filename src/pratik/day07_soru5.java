package pratik;

import java.util.Locale;
import java.util.Scanner;

public class day07_soru5 {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
        //gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
        //ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi= scan.next().toLowerCase();
        if (gunIsmi.equals("cuma")){

            System.out.println(gunIsmi+ " gunu Muslumanlar için kutsal gundur.");
        }else if (gunIsmi.equals("cumartesi")){
            System.out.println(gunIsmi+" gunu Yahudiler için kutsal gundur ");
        }else if (gunIsmi.equals("pazar")){
            System.out.println(gunIsmi+" gunu Hiristiyanlar için kutsal gundur.");
        }else {
            System.out.println(gunIsmi+" gunu hic bir din için kutsal gun degildir.");
        }

    }
}
