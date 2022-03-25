package pratik;

import java.util.Scanner;

public class While_soru4 {
    public static void main(String[] args) {
        //Soru 4)
        //Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
        //harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
        //yapmadigini farz edin.


        Scanner scan=new Scanner(System.in);
        System.out.print("baslangıc harfi : ");
        char baslangıc=scan.next().toUpperCase().charAt(0);

        System.out.print("bitiş harfi : ");
        char bitis=scan.next().toUpperCase().charAt(0);


        while (baslangıc<=bitis){

            System.out.print(baslangıc+" ");
            baslangıc++;
        }






    }
}
