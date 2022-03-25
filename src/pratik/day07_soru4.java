package pratik;

import java.util.Scanner;

public class day07_soru4 {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        //olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenın kenar uzunluklarını gırınız :");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        double kenar4= scan.nextDouble();
        if (kenar1==kenar2&& kenar1==kenar3){
            System.out.println("dikdortgeniniz bir KAREdir");
        }else {
            System.out.println("dikdortgeniniz kare DEGILDIR..");
        }

    }
}
