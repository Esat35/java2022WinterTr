package pratik;

import java.util.Locale;
import java.util.Scanner;

public class day10_switch_soru05 {
    public static void main(String[] args) {


        //Soru
        //5 Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim

        Scanner scan = new Scanner(System.in);
        System.out.println("Gun ismi giriniz");
        String günIsmi = scan.next().toLowerCase();

        switch (günIsmi) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Hafta içi");
                break;
            case "cumaryesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Hatalı gırıs...");

        }
    }
}
