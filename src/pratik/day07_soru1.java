package pratik;

import java.util.Scanner;

public class day07_soru1 {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz : ");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayi cift sayı'dir ");
        }else {
            System.out.println("girilen sayi tek sayidir..");
        }




    }
}
