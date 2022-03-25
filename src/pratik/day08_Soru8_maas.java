package pratik;

import java.util.Scanner;

public class day08_Soru8_maas {
    public static void main(String[] args) {

        //Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
        //Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
        //60
        //80.000 arasinda ise “Konusabiliriz”,
        //60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen maas teklifinizi yaziniz ");
        double maasTeklifi= scan.nextDouble();

        if (maasTeklifi<60000){
            System.out.println("Malesef teklifinizi kabul edemem.");
        }else if (maasTeklifi<80000){
            System.out.println("Konusabiliriz.");
        }else {
            System.out.println("Teklifinizi kabul ediyorum.");
        }

    }
}
