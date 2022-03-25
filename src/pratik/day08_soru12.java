package pratik;

import java.util.Scanner;

public class day08_soru12 {
    public static void main(String[] args) {
        //Soru
        //12 Kullanıcıdan 4 basamakli bir sayi girmesini isteyin Girdiği sayi 5 ’e
        //bölünüyorsa son rakamını kontrol edin Son rakamı 0 ise ekrana 5 ’e bölünen
        //çift sayı” yazdırın Son rakamı 0 değil ise 5 ’e bölünen tek sayı” yazdırın
        //Girdiği password 5 ’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı bır sayı gırınız.");

        int sayi= scan.nextInt();

        if (sayi%5==0){
            if (sayi%10==0){
                System.out.println("Girilen sayı 5 ile bölunen bir çift sayıdır.");
            }else{
                System.out.println("Girilen sayı 5 ile bölunen bir tek sayıdır.");
            }
        }else{
            System.out.println("Tekrar deneyiniz.");
        }
    }
}
