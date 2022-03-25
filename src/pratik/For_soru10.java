package pratik;

import java.util.Scanner;

public class For_soru10 {
    public static void main(String[] args) {
        //Soru 10 )
        //Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
        //toplayip, sonucu yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.print("ıkı tam sayı gırınız : ");
        int sayı1=scan.nextInt();
        int sayı2=scan.nextInt();
        int toplam=0;

        if (sayı1<sayı2){
            for (int i = sayı1; i <=sayı2 ; i++) {
                toplam+=i;

            }
            System.out.println(toplam);
        }else {
            for (int i = sayı2; i <=sayı1 ; i++) {
                toplam+=i;

            }
            System.out.println(toplam);
        }



    }
}
