package pratik;

import java.util.Scanner;

public class While_soru6 {
    public static void main(String[] args) {
        //Soru 6 )
        //Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        //olduklarini ekranda yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı gırınız : ");
        int sayı = scan.nextInt();

        int i = 1;
        int count = 0;

        System.out.print(sayı + " sayısının tam bolenleri : ");
        while (i <= sayı) {

            if (sayı % i == 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }

        System.out.println();
        System.out.println("toplam : " + count + " adet boleni var.");
    }
}
