package pratik;

import java.util.Locale;
import java.util.Scanner;

public class day07_soru3 {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //Ornek:
        //gun=Pazar output = “Hafta sonu”
        //gun=Sali output = “Hafta ici”
        //*** String icin equals method’unu kullanin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ısmı giriniz :");
        String gunIsmi= scan.next().toLowerCase();
        if (gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi")){
            System.out.println("girilen gun hafta sonudur.");
        }else {
            System.out.println("girilen gun hafta icidir");
        }


    }
}
