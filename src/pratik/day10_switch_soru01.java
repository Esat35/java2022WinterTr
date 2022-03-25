package pratik;

import java.util.Scanner;

public class day10_switch_soru01 {
    public static void main(String[] args) {
//Soru1 Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println(" haftanın kacıncı gunu oldugunu gırınız : ");
        int kacıncıGun = scan.nextInt();

        switch (kacıncıGun) {

            case 1:
                System.out.println("pazartesi");

                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;

            default:
                System.out.println("hatalı gırış");
        }

    }
}
