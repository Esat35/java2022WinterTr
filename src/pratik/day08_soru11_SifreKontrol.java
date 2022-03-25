package pratik;

import java.util.Scanner;

public class day08_soru11_SifreKontrol {
    public static void main(String[] args) {
        //Soru 11 Nested If kullanarak asagidaki soruyu cozen kodu yaziniz
        //Kullanicidan
        //bir sifre girmesini isteyin
        //Eger
        //ilk harf buyuk harf ise “ olup olmadigini kontrol edin Ilk harf A ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin
        //Eger
        //ilk harf kucuk harf ise “ olup olmadigini kontrol edin Ilk harf z ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Sifreyi giriniz.");

        String sifre= scan.next();

        if (sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'){

            if (sifre.charAt(0)=='A'){
                System.out.println("Geçerli şifre");
            }else{
                System.out.println("Geçersiz sifre");
            }


        }else if (sifre.charAt(0)>='a'&&sifre.charAt(0)<='z'){
            if (sifre.charAt(0)=='z'){
                System.out.println("Geçerli şifre");
            }else {
                System.out.println("Geçersiz şifre");
            }

        }else {
            System.out.println("Geçersiz şifre");
        }




    }
}
