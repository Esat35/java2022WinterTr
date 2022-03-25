package pratik;

import java.util.Scanner;

public class day10_switch_soru02 {
    public static void main(String[] args) {

//Soru
//2 Kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("kacıncı ay oldugunu gırınız");
        int ayIsmi = scan.nextInt();

        switch (ayIsmi) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Hazıran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;

            default:
                System.out.println("Hatalı gırıs..");
        }


    }
}
