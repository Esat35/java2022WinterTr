package pratik;

import java.util.Scanner;

public class day03_Soru4 {
    public static void main(String[] args) {
        //Soru 4)
        //Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
        //prizmanin hacmini hesaplayip yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("dikdortgenler prizmasinin uzun kenarını, kisa kenarıni ve yuksekligini giriniz :");

        double kısaKenar= scan.nextDouble();
        double uzunKenar= scan.nextDouble();
        double yukseklık=scan.nextDouble();

        double hacim=kısaKenar*uzunKenar*yukseklık;
        System.out.println("Prizmanın hacmi : "+hacim);
    }
}
