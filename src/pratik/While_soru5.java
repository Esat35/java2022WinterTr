package pratik;

import java.util.Scanner;

public class While_soru5 {
    public static void main(String[] args) {
        //Soru 5)
        //Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana
        //yazdirin. Kullanicinin hata yapmadigini farz edin.
        //Ornegin kullanici 3 girerse;
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
        Scanner scan = new Scanner(System.in);
        System.out.print("bir rakam gırınız : ");
        int rakam = scan.nextInt();
        if (rakam < 0 || rakam > 9) {

            System.out.println("hatalı gırıs. Rakam girmelisinz ");
        }else {
            int i=1;
            while (i<=10){
                System.out.print(rakam+"x"+i+"="+rakam*i);
                System.out.print(" ");
                i++;
            }


        }

    }
}
