package day19_doWhileLoop;

import java.util.Scanner;

public class C03_doWhileLoop {


        public static void main(String[] args) {
            //Soru 7 )
            //Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

            Scanner scan = new Scanner(System.in);
            System.out.print("bir sayı gırınız : ");
            int sayı = scan.nextInt();
            int rakamToplamı=0;

            while (sayı>0){
                rakamToplamı+=sayı%10;
                sayı/=10;

            }
            System.out.println("gırılen sayının rakamlar toplamı : "+rakamToplamı);

        }


    }


