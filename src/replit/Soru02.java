package replit;

import java.util.Scanner;

public class Soru02 {
    //Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
    //
    //Input :
    //
    //30 and 40
    //
    //Expected OutPut:
    //
    //GCD for 30 and 40 = 10
    //
    //LCM for 30 and 40 = 120


    /*
    Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin
    Girdi : 30 ve 40 Beklenen Çıktı: 30 için GCD ve 40 = 10 LCM 30 ve 40 = 120 için
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("iki tam sayı gırınız : ");
        int sayı1 = scan.nextInt();
        int sayı2 = scan.nextInt();
        int ebob = 1;
        int ekok = 1;
        int kucukSayı = sayı1;

        if (sayı1 < sayı2) {
            kucukSayı = sayı2;
        }

        for (int i = 1; i <= sayı1*sayı2; i++) {

            if (i % sayı1 == 0 && i % sayı2 == 0) {
                ekok *= i;
                break;
            }


        }

        for (int i =1; i <kucukSayı ; i++) {
            if (sayı1 % i == 0 && sayı2 % i == 0) {
                ebob = i;
            }
        }

        System.out.println("GCD for " + sayı1 + " and " + sayı2 + " = " + ebob);

        System.out.println("LCM for " + sayı1 + " and " + sayı2 + " = " + ekok);


    }


}
