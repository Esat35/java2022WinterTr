package pratik;

import java.util.Scanner;

public class String_manipulation_soru3 {
    public static void main(String[] args) {

        // Soru
        //3 Kullanicidan isim isteyin Eger
        //-
        //isim “a" harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
        //-
        //isim “Z" harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
        //-
        //ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
        //Soru


        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim=scan.nextLine();

        if (isim.contains("a")||isim.contains("Z")){

         if (isim.contains("Z")&&isim.contains("a")) {
             System.out.println("girdiğiğniz isim a ve Z harflerini içriyor");

         }else if (isim.contains("a")){
             System.out.println("Girdiginiz isim a harfi içeriyor");
         }else {
             System.out.println("girdiğiniz isim Z harfiiçeriyor");
         }
        }else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }

    }
}
