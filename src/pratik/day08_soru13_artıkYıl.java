package pratik;

import java.util.Scanner;

public class day08_soru13_artıkYıl {
    public static void main(String[] args) {
        //Soru
        //9 Interview Question
        //Kullanicidan
        //artik yil olup olmadigini kontrol etmek
        //icin yil girmesini isteyin
        //Kural
        //1 4 ile bolunemeyen yillar artik yil degildir
        //Kural
        //2 4 ile bolunup 100 ile bolunemeyen yillar artik
        //yildir
        //Kural
        //3 4 ’un kati olmasina ragmen 100 ile bolunebilen
        //yillardan sadece 400 ’un kati olan yillar artik
        //yildir

        Scanner scan = new Scanner(System.in);

        System.out.println("artik yil olup olmadigini kontrol etmek" +
                " icin bir yil giriniz");

        int yıl = scan.nextInt();
        if (yıl < 0) {
            System.out.println("Yıl negatif olamaz");

        } else {
            if (yıl % 4 != 0) {
                System.out.println("Girilen yıl artık yıl degıldır.");

            } else if (yıl % 4 == 0) {

                if (yıl % 100 == 0) {
                    if (yıl % 400 == 0) {
                        System.out.println("Girilen yıl artık yıldır.");
                    } else {
                        System.out.println("Girilen yıl artık degildır.");
                    }

                } else {
                    System.out.println("Girilen yıl artık yıldır.");

                }
            }
        }


    }

}




