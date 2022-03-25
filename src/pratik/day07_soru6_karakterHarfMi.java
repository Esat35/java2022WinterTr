package pratik;

import java.util.Locale;
import java.util.Scanner;

public class day07_soru6_karakterHarfMi {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
        //olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        String karakter = scan.next().toUpperCase();

        if (karakter.charAt(0) >= 65 && karakter.charAt(0) <= 90)  {
            System.out.println("girdiginiz karakter bir HARF.");
        } else {
            System.out.println("girdiginiz karakter harf DEGİL");
        }

    }
}
