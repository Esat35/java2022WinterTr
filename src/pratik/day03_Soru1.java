package pratik;

import java.util.Scanner;

public class day03_Soru1 {
    public static void main(String[] args) {
        //Soru 1)
        //Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayı gırınız :");
        int sayı1=scan.nextInt();
        int sayı2=scan.nextInt();

        System.out.println("Sayıların toplamı : "+(sayı1+sayı2));
        System.out.println("sayıların farkı : "+(sayı1-sayı2));
        System.out.println("sayıların çarpımı : "+sayı1*sayı2);
    }
}
