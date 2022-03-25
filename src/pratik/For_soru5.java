package pratik;

import java.util.Scanner;

public class For_soru5 {
    public static void main(String[] args) {
        //Soru 5)
        //Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
        //veya 5”in kati olan sayilari yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("100 den kucuk bır tam sayı gırınız : ");
        int sayı = scan.nextInt();

        if (sayı >= 0 && sayı <= 100) {

            for (int i = 1; i <= sayı; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }


    }
}
