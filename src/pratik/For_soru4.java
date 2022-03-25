package pratik;

import java.util.Scanner;

public class For_soru4 {
    public static void main(String[] args) {

        //Soru 4)
        //Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
        //kati olan sayilari yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("100 den kucuk bır tam sayı gırınız : ");
        int sayı = scan.nextInt();

        if (sayı > 0 && sayı <= 100) {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.print(i+" ");
                }
            }
        }
        if (sayı <= 0) {
            for (int i = sayı; i <=0; i++) {
                if (i % 3 == 0) {
                    System.out.print(i+" ");
                }
            }
        }


    }


}
