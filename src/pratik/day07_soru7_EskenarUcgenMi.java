package pratik;

import java.util.Scanner;

public class day07_soru7_EskenarUcgenMi {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
        //birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
        //“Eskenar degil”

        Scanner scan=new Scanner(System.in);
        System.out.println(" ucgenin uc kenar uzunlugunu giriniz.");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2&&kenar1==kenar3){
            System.out.println("Eskenar ucgen.");
        }else {
            System.out.println("Eskenar degil.");
        }



    }
}
